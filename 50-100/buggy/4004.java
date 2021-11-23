@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public org.nextprot.api.user.domain.UserProteinList createUserProteinList(org.nextprot.api.user.domain.UserProteinList userProteinList) {
    org.nextprot.api.commons.exception.NPreconditions.checkNotNull(userProteinList, "The user protein list should not be null");
    org.nextprot.api.commons.exception.NPreconditions.checkTrue((!(userProteinList.isPersisted())), "The user protein list should be new");
    long id = proteinListDao.createUserProteinList(userProteinList);
    userProteinList.setId(id);
    java.util.Set<java.lang.String> accessions = userProteinList.getAccessionNumbers();
    if ((accessions != null) && (!(accessions.isEmpty()))) {
        proteinListDao.createUserProteinListAccessions(id, accessions);
    }
    return userProteinList;
}
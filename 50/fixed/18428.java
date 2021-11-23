@org.springframework.transaction.annotation.Transactional
public void deleteGroup(ua.org.dancegrouptracker.model.Group group) {
    groupDao.delete(group);
}
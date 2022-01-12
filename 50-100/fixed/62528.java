public void isBugTitleValid(ro.msg.edu.business.bug.dto.BugDTO bugDTO) throws ro.msg.edu.business.common.exception.TechnicalException {
    ro.msg.edu.persistence.bug.entity.Bug existingBugWithSameTitle = bugDAO.findBugByTitle(bugDTO.getTitleBug());
    if ((existingBugWithSameTitle != null) && ((existingBugWithSameTitle.getId()) != (bugDTO.getId()))) {
        throw new ro.msg.edu.business.common.exception.TechnicalException(("Bug already exists with given title " + (bugDTO.getTitleBug())));
    }
}
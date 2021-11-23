private void updateCase() throws gov.epa.emissions.framework.services.EmfException {
    checkIfLockedByCurrentUser();
    saveTabs();
    caseObj.setLastModifiedBy(session.user());
    caseObj.setLastModifiedDate(new java.util.Date());
    caseObj = service().updateCaseWithLock(caseObj);
}
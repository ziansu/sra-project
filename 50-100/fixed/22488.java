public java.lang.String getNextAvailableAccessionNumber(java.lang.String prefix) throws java.lang.IllegalStateException {
    java.lang.String nextAccessionNumber;
    us.mn.state.health.lims.sample.dao.SampleDAO accessionNumberDAO = new us.mn.state.health.lims.sample.daoimpl.SampleDAOImpl();
    java.lang.String curLargestAccessionNumber = accessionNumberDAO.getLargestAccessionNumber();
    if (curLargestAccessionNumber == null) {
        nextAccessionNumber = incrementStartingValue;
    }else {
        nextAccessionNumber = incrementAccessionNumber(curLargestAccessionNumber);
        while (us.mn.state.health.lims.common.provider.validation.DigitAccessionValidator.REQUESTED_NUMBERS.contains(nextAccessionNumber)) {
            nextAccessionNumber = incrementAccessionNumber(nextAccessionNumber);
        } 
        us.mn.state.health.lims.common.provider.validation.DigitAccessionValidator.REQUESTED_NUMBERS.add(nextAccessionNumber);
    }
    return nextAccessionNumber;
}
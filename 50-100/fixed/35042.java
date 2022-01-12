private static int handleEmptyDates(java.lang.String dateString1, java.lang.String dateString2) {
    assert (dateString1.isEmpty()) || (dateString2.isEmpty());
    if ((dateString1.isEmpty()) && (dateString2.isEmpty())) {
        return seedu.ezdo.commons.util.DateUtil.COMPARE_RESULT_EQUAL;
    }else
        if (dateString1.isEmpty()) {
            return seedu.ezdo.commons.util.DateUtil.COMPARE_RESULT_MORE_THAN;
        }else {
            return seedu.ezdo.commons.util.DateUtil.COMPARE_RESULT_LESS_THAN;
        }
    
}
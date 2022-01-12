@java.lang.Override
public java.math.BigDecimal calculateAverageBurnedCaloriesPerRecord(cz.muni.fi.pa165.activeye.entities.User user) {
    if ((user.getActivityRecords()) == null)
        return null;
    
    if ((user.getActivityRecords().size()) == 0)
        return java.math.BigDecimal.ZERO;
    
    return calculateTotalCaloriesBurned(user).divide(new java.math.BigDecimal(user.getActivityRecords().size()), java.math.BigDecimal.ROUND_HALF_UP);
}
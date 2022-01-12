protected double convertDaysToQuantity(java.lang.Double days, java.util.List<java.lang.Double> forecast) {
    int i = 0;
    double quantity = 0;
    for (double remainingDays = days; remainingDays > 0; remainingDays -= fk.retail.ip.requirement.internal.Constants.DAYS_IN_WEEK , i++) {
        if (remainingDays >= (fk.retail.ip.requirement.internal.Constants.DAYS_IN_WEEK)) {
            quantity += forecast.get(i);
        }else {
            quantity += ((forecast.get(i)) * remainingDays) / (fk.retail.ip.requirement.internal.Constants.DAYS_IN_WEEK);
        }
    }
    return quantity;
}
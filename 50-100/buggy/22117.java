public void addHours(double hours) {
    hoursNormalPay += hours;
    if (((hoursNormalPay) + (prePayPeriodHours)) > 40) {
        hoursOvertime = ((hoursNormalPay) + (prePayPeriodHours)) - 40;
        hoursNormalPay = 40 - (prePayPeriodHours);
    }
}
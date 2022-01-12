private int getDaysToWater() {
    long timeDiff = (java.util.Calendar.getInstance().getTimeInMillis()) - (refDate.getTime());
    int days = ((int) (timeDiff / (com.coconut.young.wateringcan.PlantSchedule.ONE_DAY_IN_MILLISECONDS)));
    return (waterInterval) - (days % (waterInterval));
}
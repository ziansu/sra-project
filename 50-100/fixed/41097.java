public static int getStepOfCycle(by.matskevich.calendaroffactory.TypeShift typeShift, java.util.Calendar date) {
    int days = by.matskevich.calendaroffactory.util.Utils.betweenStartDayEndDay(typeShift.getBasicDate(), date);
    int step = days % (typeShift.cycleDays);
    if (step < 0) {
        step += (typeShift.cycleDays) - 1;
    }
    return step;
}
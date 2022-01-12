private java.util.List<java.util.List> generateDays() {
    projekt.tin.controller.DaysGenerator daysGenerator = new projekt.tin.controller.DaysGenerator();
    return daysGenerator.generateDays(oneDayCallsInQuarter);
}
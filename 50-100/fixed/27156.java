public double calculateSprintSEA(com.sgt.pmportal.domain.Sprint sprint) throws java.io.IOException, java.text.ParseException {
    java.lang.System.out.print("Calculating SEA...");
    double completeDate = sprint.getCompleteDate().getTime();
    double endDate = sprint.getEndDate().getTime();
    double startDate = sprint.getStartDate().getTime();
    double estimatedDuration = endDate - startDate;
    double actualDuration = completeDate - startDate;
    double sea = (actualDuration / estimatedDuration) * 100;
    java.lang.System.out.print((("done: " + sea) + "\n"));
    return sea;
}
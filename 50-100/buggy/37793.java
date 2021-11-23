public void testSEA() throws java.io.IOException, java.text.ParseException {
    java.lang.System.out.println("Getting sprints...");
    try {
        sprintList = sprintService.getClosedSprintsByProject(project);
        com.sgt.pmportal.domain.Sprint sprint = sprintList.get(0);
        java.lang.System.out.println(("SEA test will display the sea of a sprint as a\n" + "percentage.\n"));
        double sea = metricServices.calculateSprintSEA(sprint);
        java.lang.System.out.println(((("The SEA of sprint " + (sprint.getName())) + " is: ") + sea));
    } catch (java.lang.NullPointerException noSprint) {
        java.lang.System.err.println(noSprint);
    }
}
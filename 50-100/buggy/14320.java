private static java.lang.String getUPMCTest() {
    java.lang.String input = "";
    input += "UniversityUPMCAgent -resides-on> AdministrationContainer;";
    input += "SchedulerUPMCAgent -resides-on> AdministrationContainer;";
    input += "CourseCSAgent -resides-on> AdministrationContainer;";
    input += "Room04Agent -resides-on> RoomContainer;";
    input += "AliceAgent -resides-on> AliceContainer;";
    input += "Room04Agent-has-parent>UniversityUPMCAgent;";
    input += "AliceAgent -has-parent> CourseCSAgent;";
    input += "CourseCSAgent -has-parent> UniversityUPMCAgent;";
    input += "CourseCSAgent -has-parent> Room04Agent;";
    input += "SchedulerUPMCAgent -has-parent> UniversityUPMCAgent;";
    return input;
}
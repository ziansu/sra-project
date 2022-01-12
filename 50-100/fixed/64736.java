private static void setUp() {
    conference_package.UserInterface.conferenceList = conference_package.UserInterface.crw.readConferences();
    conference_package.UserInterface.userList = conference_package.UserInterface.urw.readUsers();
    if (((conference_package.UserInterface.conferenceList) == null) || ((conference_package.UserInterface.userList) == null)) {
        try {
            conference_package.UserInterface.buildTestingFiles();
        } catch (java.lang.Exception e) {
            java.lang.System.out.println("Creating Files Failed");
        }
        conference_package.UserInterface.userList = conference_package.UserInterface.urw.readUsers();
        conference_package.UserInterface.conferenceList = conference_package.UserInterface.crw.readConferences();
    }
}
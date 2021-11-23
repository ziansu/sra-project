private void playClass() {
    MainLoop : while (true) {
        java.lang.System.out.println("You are in class. What would you like to do?");
        java.lang.String command = getInput();
        switch (command) {
            case "go" :
                go();
                break MainLoop;
            case "assignments" :
                viewCourseAssignments();
                break MainLoop;
            case "return" :
                goBack();
                break MainLoop;
            default :
                java.lang.System.out.println("Available commands: assignments, return.");
                break;
        }
    } 
}
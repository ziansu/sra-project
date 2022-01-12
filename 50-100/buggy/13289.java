public java.util.List<java.lang.String> getMenuOptions(Project.State currentState) {
    java.util.List<java.lang.String> options = new java.util.ArrayList<java.lang.String>();
    if (currentState == (State.MAIN)) {
        options.add("View all Jobs");
        options.add("Search volunteers by Last Name");
        options.add("Logout");
    }else
        if (currentState == (State.VIEW_JOB)) {
            options.add("Edit job details");
            options.add("Delete job");
            options.add("Return to job list");
            options.add("Return to main menu");
        }
    
    return options;
}
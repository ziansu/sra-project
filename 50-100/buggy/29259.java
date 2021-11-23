private java.util.ArrayList<com.redmannequin.resonance.Backend.Project> getOtherProjects() {
    java.util.ArrayList<com.redmannequin.resonance.Backend.Project> otherProjects = new java.util.ArrayList<com.redmannequin.resonance.Backend.Project>();
    for (int i = 0; i < (backend.getProjectListSize()); ++i) {
        if (i == (projectID)) {
            ++i;
        }else {
            otherProjects.add(backend.getProject(i));
        }
    }
    return otherProjects;
}
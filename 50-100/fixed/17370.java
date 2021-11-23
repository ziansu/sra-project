public void resolve() {
    java.util.List<de.uni_hildesheim.sse.model.varModel.Project> projects = new java.util.ArrayList<de.uni_hildesheim.sse.model.varModel.Project>();
    findImportedProjects(projects);
    for (int p = 0; p < (projects.size()); p++) {
        de.uni_hildesheim.sse.model.varModel.Project project = projects.get(p);
        evaluator.setDispatchScope(project);
        resolveDefaultValues(project);
        resolveAnnotationAssignments(project);
        resolveAssignments(project);
    }
}
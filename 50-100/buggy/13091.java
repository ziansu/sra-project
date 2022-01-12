@java.lang.Override
public model.project.Project calculateProject(model.project.Project project) {
    this.project = project;
    if ((project.getPhases().size()) != 0) {
        calculateLenght(project);
        calculateResultSkill(project);
        calculateProjectDays(project);
        calculateQuarterResults(project);
    }else {
    }
    return project;
}
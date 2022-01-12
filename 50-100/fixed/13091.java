@java.lang.Override
public model.project.Project calculateProject(model.project.Project project) {
    this.project = project;
    if ((project.getPhases().size()) != 0) {
        calculateLenght(project);
        calculateProjectDays(project);
        calculateResultSkill(project);
        calculateQuarterResults(project);
    }else {
    }
    return project;
}
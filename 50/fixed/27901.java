@org.jetbrains.annotations.NotNull
private static org.stepik.api.objects.StudyObject getCourseStudyObject(long id) {
    org.stepik.api.client.StepikApiClient stepikApiClient = org.stepik.core.stepik.StepikAuthManager.authAndGetStepikApiClient();
    org.stepik.api.objects.courses.Course course = org.stepik.plugin.utils.Utils.getCourse(stepikApiClient, id);
    return course != null ? course : org.stepik.plugin.projectWizard.StepikProjectGenerator.EMPTY_STUDY_OBJECT;
}
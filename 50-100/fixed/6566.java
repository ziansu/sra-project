private static org.stepik.api.objects.StudyObject getLessonStudyObject(long lessonId, long unitId) {
    org.stepik.api.client.StepikApiClient stepikApiClient = org.stepik.core.stepik.StepikAuthManager.authAndGetStepikApiClient();
    org.stepik.api.objects.lessons.CompoundUnitLesson unitLesson = org.stepik.plugin.utils.Utils.getCompoundUnitLessonStudyObject(stepikApiClient, unitId, lessonId);
    org.stepik.api.objects.units.Unit unit = unitLesson.getUnit();
    if ((unit.getId()) != 0) {
        org.stepik.api.objects.sections.Section section = org.stepik.plugin.utils.Utils.getSectionStudyObject(stepikApiClient, unit.getSection());
        if (section != null) {
            return org.stepik.plugin.utils.Utils.getCourseStudyObject(section.getCourse());
        }
    }
    return unitLesson;
}
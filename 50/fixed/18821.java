@java.lang.Override
public void onLessonUnitPrepared(org.stepic.droid.model.Lesson lesson, @android.support.annotation.NonNull
org.stepic.droid.model.Unit unit, org.stepic.droid.model.Section section) {
    this.lesson = lesson;
    this.section = section;
    this.unit = unit;
    init(lesson);
}
@org.junit.Before
public void setUp() {
    ru.vaddya.schedule.core.Lesson lesson1 = new ru.vaddya.schedule.core.Lesson.Builder().startTime("12:00").endTime("13:30").subject("Программирование").lessonType(LessonType.LAB).build();
    ru.vaddya.schedule.core.Lesson lesson2 = new ru.vaddya.schedule.core.Lesson.Builder().startTime("14:00").endTime("15:30").subject("Высшая математика").lessonType(LessonType.LECTURE).build();
    week.get(DaysOfWeek.MONDAY).add(lesson1);
    week.get(DaysOfWeek.FRIDAY).add(lesson2);
}
public static java.util.ArrayList<no.northcode.jens.intranetsek2.Lesson> getLessons(no.northcode.jens.intranetsek2.Login login, java.time.LocalDate day, int days) throws java.io.IOException {
    java.time.LocalDateTime start = day.atStartOfDay();
    java.time.LocalDateTime end = start.plusDays((days - 1));
    return no.northcode.jens.intranetsek2.Lesson.getLessons(login, start, end);
}
public boolean makeExam(Java.Exam exam, org.joda.time.DateTime start, org.joda.time.DateTime end, boolean courseExam, java.lang.String instructorId) {
    return tC.makeReservation(exam, start, end, courseExam, instructorId);
}
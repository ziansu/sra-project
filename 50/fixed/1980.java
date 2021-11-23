public java.lang.String onSubmit() {
    readLanguage();
    com.gemtastic.attendencesystem.enteties.Courses c = cEJB.upsert(course);
    course = c;
    return ("course?id=" + (course.getId())) + "&faces-redirect=true";
}
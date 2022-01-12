public void refresh() {
    acornCookieJar = new com.lvds2000.AcornAPI.auth.AcornCookieJar();
    this.client = new okhttp3.OkHttpClient.Builder().cookieJar(acornCookieJar).build();
    registrationManager = new com.lvds2000.AcornAPI.auth.RegistrationManager(client);
    courseManager = new com.lvds2000.AcornAPI.course.CourseManager(client, registrationManager);
    gradeManager = new com.lvds2000.AcornAPI.grade.GradeManager(client);
}
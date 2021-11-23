@org.junit.Test
public void night() throws java.lang.Exception {
    com.samusia.organization.testTask.logic.GetTime getTime = new com.samusia.organization.testTask.logic.GetTime();
    java.time.LocalTime today = java.time.LocalTime.of(4, 0);
    java.lang.String time = getTime.getTime(today);
    if (java.util.Locale.getDefault().getLanguage().equals("ru")) {
        junit.framework.Assert.assertEquals("Доброй ночи, Мир!", time);
    }else
        if (java.util.Locale.getDefault().getLanguage().equals("en")) {
            junit.framework.Assert.assertEquals("Good night, World!", time);
        }
    
}
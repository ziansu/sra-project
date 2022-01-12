@org.junit.Test
public void night() throws java.lang.Exception {
    java.time.LocalTime today = java.time.LocalTime.of(4, 0);
    java.lang.String time = getTime.getTime(today);
    if (java.util.Locale.getDefault().getLanguage().equals("ru")) {
        junit.framework.Assert.assertEquals("Доброй ночи, Мир!", time);
    }else
        if (java.util.Locale.getDefault().getLanguage().equals("en")) {
            junit.framework.Assert.assertEquals("Good night, World!", time);
        }
    
}
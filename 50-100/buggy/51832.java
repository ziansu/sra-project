@org.junit.Test
public void listToString() {
    ua.ihor0k.util.StringListConverter slc = new ua.ihor0k.util.StringListConverter();
    java.lang.String s = "str1 → str2 → str3 → str4 → str5";
    java.util.List<ua.ihor0k.model.Page> list = java.util.Arrays.asList(new ua.ihor0k.model.Page("str1"), new ua.ihor0k.model.Page("str2"), new ua.ihor0k.model.Page("str3"), new ua.ihor0k.model.Page("str4"), new ua.ihor0k.model.Page("str5"));
    org.junit.Assert.assertEquals(slc.convertToDatabaseColumn(list), s);
}
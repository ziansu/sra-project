private static void isEmptyTest() {
    java.lang.String emptyString = "";
    if ((emptyString != null) && (emptyString.isEmpty())) {
        java.lang.System.out.println("test isEmpty of jdk - passed");
    }
    if ("".equals(emptyString)) {
        java.lang.System.out.println("test equals of jdk - passed");
    }
    if (org.apache.commons.lang.StringUtils.isEmpty(emptyString)) {
        java.lang.System.out.println("test isEmpty of apache commons - passed");
    }
    if (com.google.common.base.Strings.isNullOrEmpty(emptyString)) {
        java.lang.System.out.println("test isNullOrEmpty of Guava - passed");
    }
    if (org.springframework.util.StringUtils.hasText(emptyString)) {
        java.lang.System.out.println("test hasText of Spring - passed");
    }
}
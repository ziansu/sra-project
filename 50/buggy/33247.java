public static void showRule(java.lang.String rule) {
    controllers.Mails.welcome();
    if (org.apache.commons.lang.StringUtils.isBlank(rule)) {
        rule = "rating";
    }
    renderTemplate((("Rules/" + rule) + ".html"));
}
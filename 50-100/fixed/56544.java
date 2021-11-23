private void keypress(final java.lang.String s) {
    if (!(org.loverde.jquery.restrictedtextfield.selenium.util.StringUtil.isNothing(s))) {
        final int len = s.length();
        for (int i = 0; i < len; i++) {
            field.sendKeys(java.lang.Character.toString(s.charAt(i)));
        }
    }
}
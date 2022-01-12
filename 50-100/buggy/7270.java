public void test_getFormats() {
    java.lang.String[] orgFormats = ((java.lang.String[]) (formats.clone()));
    java.lang.String[] f = ((java.lang.String[]) (f1.getFormats()));
    assertTrue("Wrong formats", f.equals(formats));
    f[0] = "Modified";
    assertTrue("Formats copied", (!(f.equals(orgFormats))));
}
public static void main(java.lang.String[] args) {
    try {
        new browser.PostgresDriver();
        browser.DatabaseBrowser browser = new browser.DatabaseBrowser();
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.getMessage());
    }
}
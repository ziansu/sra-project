private void initSahiBrowser() {
    browser = org.sakuli.loader.BeanLoader.loadBean(org.sakuli.javaDSL.service.SahiInitializingService.class).getBrowser();
    browserProcessName = java.lang.String.valueOf(getField(browser, "browserProcessName"));
}
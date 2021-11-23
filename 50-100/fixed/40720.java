public void start() throws java.lang.Exception {
    isTxt = false;
    if (messageResource.getFile().getName().endsWith(".txt")) {
        isTxt = true;
        messageSource = new com.clickntap.developers.MessageSource();
    }else {
        super.start();
    }
}
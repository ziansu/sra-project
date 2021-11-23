static void setLocale(android.app.Activity actitity) {
    com.dev.amazonadvisor.AmazonLocaleUtils.activity = actitity;
    com.dev.amazonadvisor.AmazonLocaleUtils.locale = com.dev.amazonadvisor.AmazonLocaleUtils.getLocale(actitity);
}
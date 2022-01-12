static void setLocale(android.content.Context context) {
    com.dev.amazonadvisor.AmazonLocaleUtils.context = context;
    com.dev.amazonadvisor.AmazonLocaleUtils.locale = com.dev.amazonadvisor.AmazonLocaleUtils.getLocale(context);
}
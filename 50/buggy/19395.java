public static boolean isSecureFlxUrl(java.lang.String url) {
    return (url.startsWith(com.wb.nextgenlibrary.util.HttpHelper.SECURE_BASE_URL)) || (url.startsWith(com.wb.nextgenlibrary.util.HttpHelper.getSecureBaseUrl()));
}
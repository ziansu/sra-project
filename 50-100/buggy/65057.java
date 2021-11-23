private java.lang.String doForeachMboxFile(int i, int limit, Adaptors.SocialMedia.EmailParser parser, java.lang.String mboxLink) {
    java.lang.String mboxUrl = (baseUrl) + mboxLink;
    java.lang.String emailsInMbox = null;
    try (java.io.InputStream is = new java.net.URL(mboxUrl).openStream()) {
        emailsInMbox = org.apache.commons.io.IOUtils.toString(is, "UTF-8");
    } catch (java.io.IOException e) {
        if (i >= limit) {
            e.printStackTrace();
        }
        doForeachMboxFile((i++), limit, parser, mboxLink);
    }
    return emailsInMbox;
}
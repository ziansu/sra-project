private static java.lang.String domainToAscii(java.lang.String input) {
    try {
        java.lang.String result = java.net.IDN.toASCII(input).toLowerCase(java.util.Locale.US);
        if (result.isEmpty())
            return null;
        
        if (com.squareup.okhttp.HttpUrl.Builder.containsInvalidHostnameAsciiCodes(result)) {
            return null;
        }
        return result;
    } catch (java.lang.IllegalArgumentException e) {
        return null;
    }
}
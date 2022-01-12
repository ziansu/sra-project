@java.lang.Override
public void modify(java.lang.String currentUrl, java.io.BufferedReader inputReader, java.io.PrintWriter outputStream) {
    java.lang.String line;
    try {
        ru.codeninja.proxyapp.url.UrlEncoder urlEncoder = new ru.codeninja.proxyapp.url.UrlEncoder(currentUrl);
        while ((line = inputReader.readLine()) != null) {
            java.lang.StringBuffer lineBuff = replace(patterns, line, urlEncoder);
            outputStream.println(lineBuff);
        } 
    } catch (java.io.IOException e) {
        l.log(java.util.logging.Level.WARNING, "cannot read input stream", e);
    }
}
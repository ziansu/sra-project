@java.lang.Override
public emcshop.scraper.EmcSession login(java.lang.String username, java.lang.String password) throws java.io.IOException {
    com.github.mangstadt.emc.net.EmcWebsiteConnection connection = null;
    try {
        connection = new com.github.mangstadt.emc.net.EmcWebsiteConnectionImpl(username, password);
        return new emcshop.scraper.EmcSession(username, password, connection.getCookieStore());
    } catch (com.github.mangstadt.emc.net.InvalidCredentialsException e) {
        return null;
    } finally {
        org.apache.commons.io.IOUtils.closeQuietly(connection);
    }
}
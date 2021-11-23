protected java.util.Collection<org.apache.sshd.server.config.keys.AuthorizedKeyEntry> reloadAuthorizedKeys(java.nio.file.Path path, java.lang.String username, org.apache.sshd.server.session.ServerSession session) throws java.io.IOException {
    java.util.Collection<org.apache.sshd.server.config.keys.AuthorizedKeyEntry> entries = org.apache.sshd.server.config.keys.AuthorizedKeyEntry.readAuthorizedKeys(path, options);
    log.info(((((((("reloadAuthorizedKeys(" + username) + ")[") + session) + "] loaded ") + (org.apache.sshd.common.util.GenericUtils.size(entries))) + " keys from ") + path));
    updateReloadAttributes();
    return entries;
}
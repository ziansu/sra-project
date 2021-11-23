private static com.mcseemz.Session openIdleManagerSession(com.mcseemz.Main.Mailbox mailbox) throws com.mcseemz.MessagingException {
    java.util.Properties props = java.lang.System.getProperties();
    props.setProperty("mail.store.protocol", "imap");
    props.setProperty("mail.imap.usesocketchannels", "true");
    com.mcseemz.Session imapsession = com.mcseemz.Session.getDefaultInstance(props, null);
    imapsession.setDebug(true);
    java.lang.System.out.println("opening idleSession done");
    return imapsession;
}
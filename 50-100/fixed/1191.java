@org.junit.Test
public void folder_can_fetch_less_than_10_envelopes() throws com.fsck.k9.mail.MessagingException {
    java.util.List<com.fsck.k9.mail.store.webdav.WebDavMessage> messages = new java.util.ArrayList<>();
    for (int i = 0; i < 5; i++) {
        com.fsck.k9.mail.store.webdav.WebDavMessage mockMessage = org.mockito.Mockito.mock(com.fsck.k9.mail.store.webdav.WebDavMessage.class);
        messages.add(mockMessage);
    }
    com.fsck.k9.mail.FetchProfile profile = new com.fsck.k9.mail.FetchProfile();
    profile.add(FetchProfile.Item.ENVELOPE);
    folder.fetch(messages, profile, listener);
}
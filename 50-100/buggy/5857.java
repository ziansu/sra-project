public synchronized void addEmailStore(edu.stanford.muse.email.EmailStore stores) {
    int initialSize = emailStores.size();
    emailStores.add(stores);
    edu.stanford.muse.email.MuseEmailFetcher.log.info(((("Email fetcher went from " + initialSize) + " stores to ") + (emailStores.size())));
}
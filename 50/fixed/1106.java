public void addContact(info.blockchain.wallet.contacts.data.Contact contact) throws info.blockchain.wallet.exceptions.MetadataException, java.io.IOException, org.spongycastle.crypto.InvalidCipherTextException {
    contactList.put(contact.getId(), contact);
    save();
}
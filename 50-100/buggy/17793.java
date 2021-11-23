private void decryptAndSetValues(de.slackspace.openkeepass.domain.Entry entry, de.slackspace.openkeepass.crypto.ProtectedStringCrypto protectedStringCrypto) {
    java.util.List<de.slackspace.openkeepass.domain.Property> properties = entry.getProperties();
    for (de.slackspace.openkeepass.domain.Property property : properties) {
        de.slackspace.openkeepass.domain.PropertyValue propertyValue = property.getPropertyValue();
        if (propertyValue.isProtected()) {
            java.lang.String decrypted = protectedStringCrypto.decrypt(propertyValue.getValue());
            propertyValue.setValue(decrypted);
        }
    }
}
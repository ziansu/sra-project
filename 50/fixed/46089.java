private void prepareRemoveContactsFragment(java.util.List<in.sadrudd.contactanalyser.data.PhoneNumberFrequencyObject> uniquePhoneNumbers) {
    java.util.Set<java.lang.String> setOfContacts = new java.util.LinkedHashSet<java.lang.String>();
    setOfContacts.addAll(getContactsWithFewRegisteredCalls(uniquePhoneNumbers));
    setOfContacts.addAll(getContactsWithNoRegisteredCalls(uniquePhoneNumbers));
}
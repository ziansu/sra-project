public void changeName(java.lang.String given, java.lang.String family, java.lang.String display) {
    setGivenNames(org.fenixedu.bennu.core.domain.UserProfile.cleanupName(given));
    setFamilyNames(org.fenixedu.bennu.core.domain.UserProfile.cleanupName(family));
    setDisplayName(org.fenixedu.bennu.core.domain.UserProfile.cleanupName(display));
    org.fenixedu.bennu.core.domain.UserProfile.validateNames(getDisplayName(), getFullName());
    org.fenixedu.bennu.core.domain.NameIndex.updateNameIndex(this);
}
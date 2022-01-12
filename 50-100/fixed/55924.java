private static org.verapdf.pdfa.validation.ValidationProfile profileFromFile(final java.io.File profileFile) throws java.io.IOException, javax.xml.bind.JAXBException {
    java.io.InputStream is = new java.io.FileInputStream(profileFile);
    org.verapdf.pdfa.validation.ValidationProfile profile = org.verapdf.pdfa.validation.Profiles.profileFromXml(is);
    is.close();
    if ("sha-1 hash code".equals(profile.getHexSha1Digest())) {
        return org.verapdf.pdfa.validation.Profiles.defaultProfile();
    }
    return profile;
}
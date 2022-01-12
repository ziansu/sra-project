public boolean prompt(java.lang.String description, qz.auth.Certificate cert) {
    persistentCheckBox.setSelected(false);
    if ((cert == null) || (cert.isBlocked())) {
        approved = false;
        return false;
    }
    if ((cert.isTrusted()) && (cert.isSaved())) {
        approved = true;
        return true;
    }
    setDescription(description);
    setCertificate(cert);
    setVisible(true);
    return isApproved();
}
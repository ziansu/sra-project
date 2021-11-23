@java.lang.Override
public boolean close() {
    if (!(org.talend.registration.license.LicenseManagement.isLicenseValidated())) {
        java.lang.System.exit(0);
    }
    return super.close();
}
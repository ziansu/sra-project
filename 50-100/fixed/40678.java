@java.lang.Override
public void installCertificate(com.polarcape.secureconnect.certintaller.Certificate cert) {
    try {
        ((android.app.Activity) (mContext)).startActivityForResult(createSystemInstallIntent(cert), CertificateHelper.INSTALL_KEYCHAIN_CODE);
    } catch (android.content.ActivityNotFoundException e) {
        android.util.Log.e(com.polarcape.secureconnect.certintaller.CertificateInstaller_APILevel10.TAG, ("ERROR: " + (e.toString())));
    }
}
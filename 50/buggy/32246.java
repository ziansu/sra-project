@java.lang.Override
@javax.annotation.Nonnull
@com.helger.commons.annotation.ReturnsMutableCopy
public final java.security.cert.X509Certificate[] getAcceptedIssuers() {
    return com.helger.commons.collection.ArrayHelper.newArray(m_aRootCertificate);
}
@javax.annotation.Nonnull
@com.helger.commons.annotation.ReturnsMutableCopy
public java.security.cert.X509Certificate[] getAcceptedIssuers() {
    return com.helger.commons.collection.ArrayHelper.newArray(m_aRootCertificate);
}
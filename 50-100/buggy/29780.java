protected void readObject(@javax.annotation.Nonnull
final java.io.ObjectInputStream aOIS) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
        if ((aOIS.read()) == 1)
            m_aData = new javax.mail.internet.MimeBodyPart(aOIS);
        
    } catch (final javax.mail.MessagingException ex) {
        throw new java.io.IOException("Messaging exception", ex);
    }
    m_aMDN = ((com.helger.as2lib.message.IMessageMDN) (aOIS.readObject()));
    if ((m_aMDN) != null)
        m_aMDN.setMessage(this);
    
}
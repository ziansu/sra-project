public void addBcc(java.lang.String email) {
    try {
        for (java.lang.String mail : email.split(";"))
            this.bcc.add(new javax.mail.internet.InternetAddress(mail));
        
    } catch (javax.mail.internet.AddressException e) {
        throw new java.lang.RuntimeException(e);
    }
}
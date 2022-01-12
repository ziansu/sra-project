public void addTo(java.lang.String email) {
    try {
        for (java.lang.String mail : email.split(";"))
            if (canSendTo(mail))
                this.to.add(new javax.mail.internet.InternetAddress(mail));
            
        
    } catch (javax.mail.internet.AddressException e) {
        throw new java.lang.RuntimeException(e);
    }
}
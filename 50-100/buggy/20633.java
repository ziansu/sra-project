@java.lang.Override
public java.io.Serializable call() throws java.lang.Exception {
    byte[] encryptedPassword = passwordCrackerContext.getEncryptedPassword();
    while (passwordGenerator.hasNext()) {
        java.lang.String candidateForPassword = passwordGenerator.next();
        byte[] digest = encrypt(candidateForPassword.getBytes());
        if (digest.equals(encryptedPassword)) {
            return candidateForPassword;
        }
    } 
    return null;
}
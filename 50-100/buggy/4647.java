@java.lang.Override
public encryptor.EncryptorReturn encrypt(java.lang.String in) throws encryptor.CustomizeEncryptorException {
    if (((password) == null) || ((password) == ""))
        throw new encryptor.CustomizeEncryptorException("Empty password");
    
    java.lang.String properIn = preprocessingEncryptToDisplay(in);
    encryptor.XOREncryptor.PasswordXORer xorer = new encryptor.XOREncryptor.PasswordXORer(password);
    return encryptor.XOREncryptor.XORWithPassword6Bit(properIn, xorer);
}
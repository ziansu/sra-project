private short internalAuthenticate(openpgpcard.APDU apdu) {
    if ((!(pw1.isValidated())) && (pw1_modes[openpgpcard.OpenPGPApplet.PW1_MODE_NO82]))
        openpgpcard.ISOException.throwIt(openpgpcard.SW_SECURITY_STATUS_NOT_SATISFIED);
    
    if (!(auth_key.getPrivate().isInitialized()))
        openpgpcard.ISOException.throwIt(openpgpcard.SW_CONDITIONS_NOT_SATISFIED);
    
    cipher.init(auth_key.getPrivate(), Cipher.MODE_ENCRYPT);
    return cipher.doFinal(buffer, openpgpcard.OpenPGPApplet._0, in_received, buffer, openpgpcard.OpenPGPApplet._0);
}
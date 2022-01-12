private void writePrivateKey(byte[] privateKeyData, char[] oldPassword) throws org.kontalk.misc.KonException {
    char[] newPassword = org.jivesoftware.smack.util.StringUtils.randomString(40).toCharArray();
    org.kontalk.system.AccountLoader.writePrivateKey(privateKeyData, oldPassword, newPassword);
    mConf.setProperty(Config.ACC_PASS, new java.lang.String(newPassword));
}
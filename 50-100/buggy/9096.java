public java.lang.String genCheckSum() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append(com.netease.RequestHeader.SECRET_KEY).append(this.nonce).append(this.curTime);
    try {
        java.security.MessageDigest md = java.security.MessageDigest.getInstance("SHA-1");
        md.digest(sb.toString().getBytes());
        this.checkSum = com.netease.RequestHeader.bytesToHexString(md.digest());
    } catch (java.security.NoSuchAlgorithmException e) {
        e.printStackTrace();
    }
    return checkSum;
}
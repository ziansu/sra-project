public java.lang.String digest(boolean reset) {
    java.security.MessageDigest clone;
    if (!reset) {
        try {
            clone = ((java.security.MessageDigest) (this.digest.clone()));
        } catch (java.lang.CloneNotSupportedException var5) {
            clone = this.digest;
        }
    }else {
        clone = this.digest;
    }
    byte[] resultHex = clone.digest();
    java.lang.String result = java.lang.String.format("%032x", new java.lang.Object[]{ new java.math.BigInteger(1, resultHex) });
    return result;
}
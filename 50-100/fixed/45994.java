public synchronized java.lang.String count(java.lang.String nonce) {
    java.lang.Integer count = nonces.get(nonce);
    if (count == null) {
        count = java.lang.Integer.valueOf(1);
    }else {
        count = java.lang.Integer.valueOf(((count.intValue()) + 1));
    }
    nonces.put(nonce, count);
    return java.lang.String.format("%08x", count.intValue());
}
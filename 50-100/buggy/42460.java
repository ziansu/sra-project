java.security.PublicKey getServerPublicKey() {
    if ((serverPublicKey) == null) {
        return null;
    }
    try {
        java.lang.Object res = fromString(serverPublicKey);
        if (res instanceof java.security.PublicKey) {
            return ((java.security.PublicKey) (res));
        }else {
            return null;
        }
    } catch (java.io.IOException | java.lang.ClassNotFoundException e) {
        e.printStackTrace();
        return null;
    }
}
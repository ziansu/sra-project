public void unlock(java.lang.String url, java.lang.String token) {
    try {
        sardine.unlock(url, token);
        java.lang.System.err.println(((url + " unlocked with token : ") + token));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}
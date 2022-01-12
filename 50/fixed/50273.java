public void unlock(java.lang.String url, java.lang.String token) {
    try {
        sardine.unlock(url, token);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}
public boolean initCamera(java.lang.String cam) {
    try {
        camera = new java.net.URL(cam);
        new java.lang.Thread(this).start();
    } catch (java.net.MalformedURLException e) {
        e.printStackTrace();
    }
    return (camera) != null;
}
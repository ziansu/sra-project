void receive(java.net.Socket target) throws java.io.IOException {
    java.io.BufferedReader sockin = new java.io.BufferedReader(new java.io.InputStreamReader(target.getInputStream()));
    while (!(sockin.ready())) {
    } 
    while (sockin.ready()) {
        try {
            java.lang.String msg = sockin.readLine();
        } catch (java.lang.Exception e) {
            javafx.application.Platform.runLater(() -> badNews(e.getMessage()));
            e.printStackTrace();
        }
    } 
}
public void run() {
    server = new fulltexteditor.MyServer(this);
    java.lang.String message = "Server Started " + (server.getSocket().toString());
    if ((server) != null) {
        output.setText(message);
        java.lang.System.out.println(message);
    }else {
        output.setText("Oops something went wrong");
        return ;
    }
}
@javafx.fxml.FXML
public void back2Dial() {
    try {
        java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(socket.getOutputStream());
        oos.writeObject("close");
        oos.close();
        callover();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}
private void displayMessages() {
    java.lang.String t = "";
    for (Message m : messages) {
        t += (m.toString()) + "\n";
    }
    External.Singleton.debugPrint(((t + "") + (messages.size())));
    javafx.scene.text.Text scenetitle = new javafx.scene.text.Text(t);
    scenetitle.setFont(javafx.scene.text.Font.font("Tahoma", javafx.scene.text.FontWeight.NORMAL, 16));
    sp.setContent(scenetitle);
}
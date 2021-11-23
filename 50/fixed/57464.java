@java.lang.Override
public void run() {
    polygon.setPoints(path);
    if ((path.size()) > 0) {
        polygon.setVisible(true);
    }else {
        polygon.setVisible(false);
    }
    sendNoResult(callbackContext);
}
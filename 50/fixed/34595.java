@java.lang.Override
public void run() {
    if (!(running)) {
        this.cancel();
        return ;
    }
    javafx.application.Platform.runLater(() -> date.setText(convertDate(dateInstance)));
}
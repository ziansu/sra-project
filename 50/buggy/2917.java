@java.lang.Override
public void onFinish() {
    stopTimer();
    play();
    javafx.application.Platform.runLater(() -> text.setText(com.moosti.Utils.fromMillis(0)));
}
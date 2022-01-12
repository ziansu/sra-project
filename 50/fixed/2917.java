@java.lang.Override
public void onFinish() {
    stopTimer();
    javafx.application.Platform.runLater(() -> text.setText(com.moosti.Utils.fromMillis(0)));
    play();
}
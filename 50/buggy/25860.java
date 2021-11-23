@java.lang.Override
public void handleProgressNotification(javafx.application.Preloader.ProgressNotification pn) {
    java.lang.System.out.println(("% " + (pn.getProgress())));
    bar.setProgress(pn.getProgress());
}
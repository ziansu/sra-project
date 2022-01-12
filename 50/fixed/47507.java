@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int i) {
    initThread();
    mCommand += "-aoa";
    start();
}
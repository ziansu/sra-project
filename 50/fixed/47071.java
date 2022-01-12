@java.lang.Override
public void onClick(android.view.View view) {
    if ((count) == 0) {
        sendMessage("off");
        count = 1;
    }else {
        count = 0;
        sendMessage("on");
    }
}
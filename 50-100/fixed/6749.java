@java.lang.Override
public void back() {
    if ((mPosition) == 0)
        mPosition = (jsData.length()) - 1;
    else
        (mPosition)--;
    
    controller.setEndTime(0);
    player.stop();
    player.reset();
}
@java.lang.Override
public void handleMessage(android.os.Message msg) {
    if (((number) % 3) == 0) {
        mNumberSwitchView.setNumberColor(Color.RED);
        mNumberSwitchView.setNumberBGColor(Color.BLACK);
    }else {
        mNumberSwitchView.setNumberColor(android.graphics.Color.rgb(10, 10, 10));
        mNumberSwitchView.setNumberBGColor(Color.BLUE);
    }
    mNumberSwitchView.animateTo(number);
}
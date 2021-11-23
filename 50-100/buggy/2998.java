@java.lang.Override
public void handleMessage(android.os.Message msg) {
    if (((number) % 3) == 0) {
        mNumberSwitchView.setNumberStrokeWidth(number);
        mNumberSwitchView.setNumberColor(Color.RED);
        mNumberSwitchView.setNumberBGColor(Color.BLACK);
    }else {
        mNumberSwitchView.setNumberStrokeWidth(5);
        mNumberSwitchView.setNumberColor(android.graphics.Color.rgb(10, 10, 10));
        mNumberSwitchView.setNumberBGColor(Color.BLUE);
    }
    mNumberSwitchView.animateTo(number);
}
private void registerTouchOnButtonListener() {
    android.widget.Button leftBtn = ((android.widget.Button) (findViewById(R.id.leftBtn)));
    leftBtn.setOnTouchListener(new tk.android.rcarduino.listener.MyTouchOnButtonListener(controller, 2, 1));
    android.widget.Button rightBtn = ((android.widget.Button) (findViewById(R.id.rightBtn)));
    rightBtn.setOnTouchListener(new tk.android.rcarduino.listener.MyTouchOnButtonListener(controller, 3, 4));
}
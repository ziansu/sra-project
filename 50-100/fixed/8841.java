public void PressButton(int i) {
    if (com.kuna.ibeatcon_android.Controller.vb_feedback) {
        android.os.Vibrator v = ((android.os.Vibrator) (getSystemService(Context.VIBRATOR_SERVICE)));
        v.vibrate(100);
        SendData(pressKey[i]);
    }else {
        SendData(pressKey[i]);
    }
}
public void minusButton_onClick(android.view.View v) {
    if ((jumbCounter) <= 0) {
        jumbCounter = 0;
        return ;
    }
    long oldPressTime = lastPressTime;
    lastPressTime = java.lang.System.currentTimeMillis();
    if (((lastPressTime) - oldPressTime) > (com.ateolan.jumbcount.MainActivity.DOUBLE_PRESS_INTERVAL)) {
        android.widget.Toast.makeText(getApplicationContext(), "Press twice to remove", Toast.LENGTH_SHORT).show();
        return ;
    }
    lastPressTime = 0;
    (jumbCounter)--;
    updateCounterTV();
}
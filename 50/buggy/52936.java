@java.lang.Override
protected void onPause() {
    super.onPause();
    com.example.wsmm.util.SPManager.setDay(this, (-1));
    com.example.wsmm.util.SPManager.setMonth(this, (-1));
    com.example.wsmm.util.SPManager.setYear(this, (-1));
}
@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if (progress < 20) {
        intent.putExtra("brightness", 20);
    }else {
        intent.putExtra("brightness", progress);
    }
    if ((Build.VERSION.SDK_INT) <= (Build.VERSION_CODES.M))
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    
    this.startActivity(intent);
}
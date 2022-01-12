@java.lang.Override
public void onWindowFocusChanged(boolean hasFocus) {
    super.onWindowFocusChanged(hasFocus);
    if (hasFocus) {
        android.view.View imageView = new android.widget.ImageView(this);
        imageView.setBackgroundResource(R.mipmap.tip_show);
        com.example.wss.test.TipShow tipShow = new com.example.wss.test.TipShow();
        tipShow.mainBottom = true;
        tipShow.setShowViewLocation(true, false, false, true, true);
        tipShow.addTip(this, textView, imageView);
    }
}
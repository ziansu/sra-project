private void initLeftButton() {
    android.widget.FrameLayout fl = ((android.widget.FrameLayout) (this.findViewById(R.id.flLeftButton)));
    com.joshsera.ViewGroup.LayoutParams lp = fl.getLayoutParams();
    if (!(Settings.hideMouseButtons))
        lp.height = 0;
    
    fl.setLayoutParams(lp);
    fl.setOnTouchListener(new android.view.View.OnTouchListener() {
        public boolean onTouch(android.view.View v, android.view.MotionEvent ev) {
            return onLeftTouch(ev);
        }
    });
    this.flLeftButton = fl;
}
@java.lang.Override
public void onClick(android.view.View view) {
    izv = new com.yeray697.imagezoomview.ImageZoomView(this);
    ((android.widget.RelativeLayout) (findViewById(R.id.activity_sample))).addView(izv);
    izv.zoomImageFromThumb(R.id.activity_sample, getResources().getDrawable(R.mipmap.ic_launcher), view, new com.yeray697.imagezoomview.ImageZoomView.OnAnimationListener() {
        @java.lang.Override
        public void preZoomIn() {
        }

        @java.lang.Override
        public void postZoomIn() {
        }

        @java.lang.Override
        public void preZoomOut() {
        }

        @java.lang.Override
        public void postZoomOut() {
        }
    });
}
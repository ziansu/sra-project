private void initRotateView() {
    if ((mRotateView) != null) {
        return ;
    }
    mRotateView = new android.widget.ImageView(getContext());
    mRotateView.setImageResource(R.drawable.ic_rotate);
    mRotateView.setBackgroundResource(R.drawable.stretch_shape_background);
    mRotateView.setOnTouchListener(createRotateListener());
    final int rotateViewGravity = (android.view.Gravity.RIGHT) | (android.view.Gravity.TOP);
    final net.yazeed44.resizableviewlibrary.LayoutParams rotateViewLayoutParams = new net.yazeed44.resizableviewlibrary.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, rotateViewGravity);
    addView(mRotateView, rotateViewLayoutParams);
}
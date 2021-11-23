@java.lang.Override
public android.view.View getView(android.view.ViewGroup container) {
    android.view.ViewGroup v = super.inflatePhotoView(container);
    v.removeView(v.findViewById(R.id.subsampling));
    android.view.View view = v.findViewById(R.id.image);
    us.koller.cameraroll.util.ItemViewUtil.bindTransitionView(((android.widget.ImageView) (view)), albumItem, null);
    return v;
}
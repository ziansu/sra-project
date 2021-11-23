@java.lang.Override
public void onFindView(@android.support.annotation.NonNull
android.view.View parent) {
    if ((mImageView) == null)
        mImageView = ((android.widget.ImageView) (parent.findViewById(R.id.img_single)));
    
    if ((maxWidth) == 0) {
        maxWidth = (razerdp.friendcircle.utils.UIHelper.getScreenPixWidth(context)) - (razerdp.friendcircle.utils.UIHelper.dipToPx(context, 90.0F));
    }
    if ((maxHeight) == 0) {
        maxHeight = razerdp.friendcircle.utils.UIHelper.dipToPx(context, 175.0F);
    }
    ratio = (maxWidth) / (maxHeight);
}
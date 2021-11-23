@java.lang.Override
public void onStickerPagerItemClick(int id) {
    jalal.test.com.selfiestickr.view.GestureTransformationView sticker = null;
    if (mIsEditing) {
        sticker = mStickersList.get(0);
    }else {
        sticker = new jalal.test.com.selfiestickr.view.GestureTransformationView(getActivity());
        sticker.addOnStickerMoveListener(this);
        mStickersList.add(0, sticker);
        mContainer.addView(sticker);
    }
    android.graphics.drawable.Drawable stickerDrawable = getResources().getDrawable(id);
    sticker.setStickrDrawable(stickerDrawable);
}
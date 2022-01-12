@java.lang.Override
public void onStickerPagerItemClick(int id) {
    jalal.test.com.selfiestickr.view.GestureTransformationView sticker = null;
    if (mIsEditing) {
        int size = mStickersList.size();
        sticker = mStickersList.get((size - 1));
    }else {
        sticker = new jalal.test.com.selfiestickr.view.GestureTransformationView(getActivity());
        sticker.addOnStickerMoveListener(this);
        mStickersList.add(sticker);
        mContainer.addView(sticker);
    }
    android.graphics.drawable.Drawable stickerDrawable = getResources().getDrawable(id);
    sticker.setStickrDrawable(stickerDrawable);
}
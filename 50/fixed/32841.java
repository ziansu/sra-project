@java.lang.Override
public void endAnimation() {
    if (layout.isMovedOutSize()) {
        mDatas.remove(position);
        notifyDataSetChanged();
    }else {
        dragImageView.setVisibility(View.VISIBLE);
    }
}
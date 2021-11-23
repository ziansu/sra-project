@java.lang.Override
public void endAnimation() {
    if (layout.isMovedOutSize()) {
        mDatas.remove(position);
        notifyDataSetChanged();
    }else {
        android.util.Log.d("d", "-------- : ----------- movedOut");
        dragImageView.setVisibility(View.VISIBLE);
    }
}
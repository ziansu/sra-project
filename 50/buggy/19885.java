@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String buttonClickMessage = "Clicked button 1 at position " + position;
    android.util.Log.v(LOG_TAG, buttonClickMessage);
    recyclerViewButtonClickListener.onButton1Click(holder.mImageView.getId(), position);
}
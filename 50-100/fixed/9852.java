@java.lang.Override
public void onClick(android.view.View v) {
    if ((makeupCount) < (saveBitmap.size())) {
        (makeupCount)++;
        temp = saveBitmap.get(makeupCount).copy(temp.getConfig(), true);
        imageView.setImageBitmap(temp);
        android.util.Log.d(((fyp.hkust.facet.activity.ColorizeFaceActivity.TAG) + " redo "), (((saveBitmap.size()) + " ") + (makeupCount)));
    }
}
@java.lang.Override
public void onGlobalLayout() {
    if ((Build.VERSION.SDK_INT) < 16) {
        view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }else {
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
    holderToAdd.reviewCharView.makeCanvas();
    try {
        holderToAdd.reviewCharView.loadValuesFromFile();
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    holders.add(position, holderToAdd);
    android.util.Log.v("ReviewAdapter", ("Added holder to holders at " + position));
}
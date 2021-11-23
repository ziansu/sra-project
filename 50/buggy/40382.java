@java.lang.Override
public void onChanged() {
    android.util.Log.v(fr.nihilus.recyclerfragment.RecyclerFragment.TAG, "onChanged: dataset has changed");
    if (isVisible()) {
        this.setEmptyShown(isEmpty());
    }
}
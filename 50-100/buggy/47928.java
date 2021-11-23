public void updateItem(@android.support.annotation.IntRange(from = 0)
int position, @android.support.annotation.NonNull
T item, @android.support.annotation.Nullable
java.lang.Object payload) {
    if ((position < 0) && (position >= (mItems.size()))) {
        android.util.Log.e(eu.davidea.flexibleadapter.FlexibleAdapter.TAG, "Cannot updateItem on position out of OutOfBounds!");
        return ;
    }
    mItems.set(position, item);
    if (DEBUG)
        android.util.Log.v(eu.davidea.flexibleadapter.FlexibleAdapter.TAG, ("updateItem notifyItemChanged on position " + position));
    
    eu.davidea.flexibleadapter.FlexibleAdapter.notifyItemChanged(position, payload);
}
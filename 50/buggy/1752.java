@java.lang.Override
public void onClick(android.view.View v) {
    mAdapterCallback.onItemClick(getAdapterPosition());
    android.util.Log.d("Viewholder ", "clicked");
}
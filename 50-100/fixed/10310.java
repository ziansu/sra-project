@java.lang.Override
public void onClick(android.view.View view) {
    android.util.Log.d("click listener", "working!");
    int itemPosition = getLayoutPosition();
    android.content.Intent intent = new android.content.Intent(mContext, com.epicodus.a4u2poo.DetailActivity.class);
    intent.putExtra("position", itemPosition);
    intent.putExtra("restrooms", org.parceler.Parcels.wrap(mRestrooms));
    mContext.startActivity(intent);
}
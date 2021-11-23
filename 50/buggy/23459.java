@java.lang.Override
public void onItemClick(int position) {
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putString("url", albumList.get(position).getUrl());
    goToNext(storm.magicspace.activity.album.WebActivity.class, bundle);
}
public void run() {
    android.util.Log.v(li.zeitgeist.android.GalleryAdapter.TAG, ("NOTIFY DATASET CHANGED : " + (java.lang.String.valueOf(getCount()))));
    galleryActivity.hideProgressDialog();
    notifyDataSetChanged();
}
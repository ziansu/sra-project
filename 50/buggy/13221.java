protected void onPostExecute(xyz.pinaki.revlchallenge.data.ImageSearchResult result) {
    android.util.Log.i("PINAKI-onPostExecute", "onPostExecute");
    thumbnailRecyclerViewAdapter.update(result);
    thumbnailRecyclerViewAdapter.notifyDataSetChanged();
    offset = (offset) + (count);
}
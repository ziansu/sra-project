protected void onPostExecute(xyz.pinaki.revlchallenge.data.ImageSearchResult result) {
    thumbnailRecyclerViewAdapter.update(result);
    thumbnailRecyclerViewAdapter.notifyDataSetChanged();
    offset = (offset) + (count);
}
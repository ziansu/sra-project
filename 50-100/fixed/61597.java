@java.lang.Override
protected void onPostExecute(java.util.ArrayList<com.sabi.project.auctus.Model.Auction> as) {
    super.onPostExecute(as);
    auctions.addAll(as);
    if (auctions.isEmpty()) {
        noPart.setVisibility(View.VISIBLE);
        listView.setVisibility(View.GONE);
    }else {
        noPart.setVisibility(View.GONE);
        listView.setVisibility(View.VISIBLE);
    }
    adapter.notifyDataSetChanged();
}
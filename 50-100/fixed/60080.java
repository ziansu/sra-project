@java.lang.Override
protected void onResume() {
    super.onResume();
    mBidsAdapter = new com.byteshaft.auction.ItemDetail.BidsAdapter(arrayList);
    mRecyclerView.setAdapter(mBidsAdapter);
    mRecyclerView.addOnItemTouchListener(new com.byteshaft.auction.ItemDetail.BidsAdapter(arrayList, getApplicationContext(), new com.byteshaft.auction.ItemDetail.BidsAdapter.OnItemClickListener() {
        @java.lang.Override
        public void onItem(java.lang.String item) {
            java.lang.System.out.println(item);
        }
    }));
}
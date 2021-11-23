@java.lang.Override
protected void onResume() {
    super.onResume();
    mBidsAdapter = new com.byteshaft.auction.ItemDetail.BidsAdapter(arrayList);
    mRecyclerView.setAdapter(mBidsAdapter);
    java.lang.System.out.println(((mRecyclerView) == null));
    java.lang.System.out.println(((mBidsAdapter) == null));
    mRecyclerView.addOnItemTouchListener(new com.byteshaft.auction.ItemDetail.BidsAdapter(arrayList, getApplicationContext(), new com.byteshaft.auction.ItemDetail.BidsAdapter.OnItemClickListener() {
        @java.lang.Override
        public void onItem(java.lang.String item) {
            java.lang.System.out.println(item);
        }
    }));
    java.lang.System.out.println("DONE");
}
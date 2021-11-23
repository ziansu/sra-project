@java.lang.Override
protected void findViews(android.view.View v) {
    super.findViews(v);
    v.findViewById(R.id.add_offer).setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            addOffer();
        }
    });
    offer_list = ((android.support.v7.widget.RecyclerView) (v.findViewById(R.id.offer_list)));
    offer_list.setVisibility(View.GONE);
    initList();
    initGameFragment();
}
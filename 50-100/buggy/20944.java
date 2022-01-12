@java.lang.Override
public mah.bidme.CustomAdapter.ItemRecyclerAdapter.ItemViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View itemView = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_item_row, parent, false);
    mah.bidme.Utility.loggedInName = "Kevin";
    mFirebase = Utility.myFirebaseRef.child("items");
    mContext = parent.getContext();
    return new mah.bidme.CustomAdapter.ItemRecyclerAdapter.ItemViewHolder(itemView);
}
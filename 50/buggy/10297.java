@java.lang.Override
public com.benjaminearley.mysubs.BottomSheetAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.LayoutInflater inflater = android.view.LayoutInflater.from(parent.getContext());
    android.view.View view = inflater.inflate(R.layout.bottom_sheet_fragment_dialog_item, null);
    return new com.benjaminearley.mysubs.BottomSheetAdapter.ViewHolder(view);
}
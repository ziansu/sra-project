@java.lang.Override
public com.blm.hightide.fragments.RelativeTableFragment.BaseHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.LayoutInflater inflator = android.view.LayoutInflater.from(getActivity());
    android.view.View view = inflator.inflate(R.layout.grid_item_textview, parent, false);
    if (viewType == 0) {
        return new com.blm.hightide.fragments.RelativeTableFragment.StringHolder(view);
    }else {
        return new com.blm.hightide.fragments.RelativeTableFragment.RelativeTickHolder(view);
    }
}
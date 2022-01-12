@java.lang.Override
public com.blm.hightide.fragments.RelativeTableFragment.BaseHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.LayoutInflater inflator = android.view.LayoutInflater.from(getActivity());
    if (viewType == 0) {
        android.view.View view = inflator.inflate(R.layout.grid_item_textview, parent, false);
        return new com.blm.hightide.fragments.RelativeTableFragment.StringHolder(view);
    }else {
        android.view.View view = inflator.inflate(R.layout.grid_item_relative_tick, parent, false);
        return new com.blm.hightide.fragments.RelativeTableFragment.RelativeTickHolder(view);
    }
}
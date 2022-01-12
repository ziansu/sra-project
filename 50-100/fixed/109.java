@java.lang.Override
public ayalma.ir.NavigationView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.LayoutInflater inflater = android.view.LayoutInflater.from(parent.getContext());
    android.view.View view;
    if (viewType == (HolderType.Header.getValue())) {
        view = inflater.inflate(headerView, parent, false);
        return new ayalma.ir.NavigationView.NavigationView.headerHolder(view);
    }else {
        view = inflater.inflate(R.layout.navigation_row_rtl, parent, false);
        return new ayalma.ir.NavigationView.NavigationView.ItemHolder(view);
    }
}
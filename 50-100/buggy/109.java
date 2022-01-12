@java.lang.Override
public ayalma.ir.NavigationView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.LayoutInflater inflater = android.view.LayoutInflater.from(parent.getContext());
    if (viewType == (HolderType.Header.getValue())) {
        return new ayalma.ir.NavigationView.NavigationView.headerHolder(headerView);
    }else {
        android.view.View view = inflater.inflate(R.layout.navigation_row_rtl, parent, false);
        return new ayalma.ir.NavigationView.NavigationView.ItemHolder(view);
    }
}
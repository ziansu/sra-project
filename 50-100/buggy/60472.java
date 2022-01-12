@java.lang.Override
public com.shoreexcursioneer.tester.adapters.ListAdapter.TicketViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.LayoutInflater inflater = android.view.LayoutInflater.from(parent.getContext());
    android.view.View view;
    switch (viewType) {
        case 0 :
            view = inflater.inflate(R.layout.list_item, parent, false);
            break;
        case 1 :
            view = inflater.inflate(R.layout.list_item_header, parent, false);
            break;
        default :
            view = inflater.inflate(R.layout.list_item, parent, false);
    }
    return new com.shoreexcursioneer.tester.adapters.ListAdapter.TicketViewHolder(view);
}
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View v = inflater.inflate(R.layout.fragment_wishlist_item_list, container, false);
    mListView = ((android.widget.ListView) (v.findViewById(android.R.id.list)));
    return v;
}
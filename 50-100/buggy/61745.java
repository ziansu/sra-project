@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View contentView = inflater.inflate(R.layout.fragment_exchanges, container, false);
    textView = ((android.widget.TextView) (contentView.findViewById(R.id.sectionLabel)));
    textView.setText(section);
    listView = ((android.widget.ListView) (contentView.findViewById(R.id.exchangeListView)));
    listView.setAdapter(new com.comp4020.adapters.LibraryListArrayAdapter(contentView.getContext(), R.layout.row_layout_book, titles, authors, covers, null));
    return contentView;
}
@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_books, container, false);
    booksRecyclerView = ((android.support.v7.widget.RecyclerView) (view.findViewById(R.id.books_recycler_view)));
    setHasOptionsMenu(true);
    getActivity().setTitle(R.string.searchbook_title);
    updateItems();
    return view;
}
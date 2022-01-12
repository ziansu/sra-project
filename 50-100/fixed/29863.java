@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.fragment_book_detail, container, false);
    i = getActivity().getIntent();
    if ((i) != null) {
        book = ((gfandos.m08_uf1_project.Pojos.Book) (i.getSerializableExtra("book")));
        if ((book) != null) {
            android.util.Log.d("BOOK:", book.toString());
            updateDetail(book);
        }
    }
    return view;
}
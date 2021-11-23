@java.lang.Override
public void actionCompleted(java.util.List<com.example.vlad.licenta.model.Book> res) {
    if (res == null)
        res = new java.util.ArrayList<>();
    
    favouriteBooks = res;
    if ((adapter) == null) {
        adapter = new com.example.vlad.licenta.CustomAdapterBooks(favouriteBooks, getContext());
        lv.setAdapter(adapter);
    }
    adapter.refresh(favouriteBooks);
}
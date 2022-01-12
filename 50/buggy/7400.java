@java.lang.Override
public void bindAdapter() {
    model = new cn.edu.jxnu.awesome_campus.model.library.BookBorrowedModel();
    adapter = new cn.edu.jxnu.awesome_campus.support.adapter.library.BookBorrowedAdapter(getActivity(), model);
    recyclerView.setAdapter(adapter);
    onDataRefresh();
    displayLoading();
}
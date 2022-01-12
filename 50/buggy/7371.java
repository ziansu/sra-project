@java.lang.Override
public void onLoadMore(int currentPage) {
    if (((contactsListAdapter) != null) && (contactsListPresenter.hasNextPage())) {
        contactsListPresenter.setCurrentPage(currentPage);
        contactsListPresenter.getContacts();
    }
}
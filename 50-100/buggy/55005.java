@butterknife.OnClick(value = R.id.delete_button)
public void deleteButtonClick() {
    android.content.Intent bookIntent = new android.content.Intent(getActivity(), it.jaschke.alexandria.services.BookService.class);
    bookIntent.putExtra(BookService.EAN, ean);
    bookIntent.setAction(BookService.DELETE_BOOK);
    getActivity().startService(bookIntent);
    getActivity().getSupportFragmentManager().popBackStack();
    ((it.jaschke.alexandria.activities.MainActivity) (getActivity())).loadFragment(new it.jaschke.alexandria.fragments.ListOfBooks());
}
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View v = inflater.inflate(R.layout.fragment_wishlist_item_list, container, false);
    mListView = ((android.widget.ListView) (v.findViewById(android.R.id.list)));
    mListView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE_MODAL);
    com.ghstudios.android.ui.detail.WishlistDataDetailFragment.WishlistDataMultiChoiceListener multiChoiceListener = new com.ghstudios.android.ui.detail.WishlistDataDetailFragment.WishlistDataMultiChoiceListener();
    mListView.setMultiChoiceModeListener(multiChoiceListener);
    return v;
}
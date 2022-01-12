@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.support.v7.widget.RecyclerView rootView = rootView = ((android.support.v7.widget.RecyclerView) (inflater.inflate(R.layout.fragment_display_drawn_cards, container, false)));
    android.support.v7.widget.RecyclerView.LayoutManager mLayoutManager = new android.support.v7.widget.GridLayoutManager(getActivity(), columnSpan);
    rootView.setLayoutManager(mLayoutManager);
    com.example.filu.deckofcards.DisplayDrawnCardsFragment.CardImageAdapter mAdapter = new com.example.filu.deckofcards.DisplayDrawnCardsFragment.CardImageAdapter(images);
    rootView.setAdapter(mAdapter);
    rootView.scrollToPosition(0);
    return rootView;
}
public android.view.View findViewByCard(com.example.james.cardsuite.Card card) {
    for (android.widget.ImageView view : cardViews) {
        if (view.getTag().equals(card))
            return view;
        
    }
    return null;
}
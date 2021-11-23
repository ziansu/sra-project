@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    com.example.neozhang.test1.Cards newCard = new com.example.neozhang.test1.Cards(query, "Sorry, we got no anwser for this question right now.");
    cards.add(1, newCard);
    mAdapter.notifyItemInserted(1);
    return true;
}
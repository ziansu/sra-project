public void removeAllCards(com.tonykazanjian.codenamescompanion.adapter.ItemBaseAdapter[] adapters) {
    mGridEmptyStateLl.setVisibility(View.GONE);
    for (int i = 0; i < ((adapters.length) - 1); i++) {
        if ((adapters[i]) != null) {
            adapters[i].clearWordCards();
            adapters[i].notifyDataSetChanged();
        }
    }
}
@java.lang.Override
public void onItemClick(com.denisk.bullshitbingochampion.AdapterView<?> parent, com.denisk.bullshitbingochampion.View view, int position, long id) {
    java.lang.String card = ((java.lang.String) (parent.getItemAtPosition(position)));
    if (card.equals(currentCardName)) {
        drawerLayout.closeDrawers();
        return ;
    }
    persistIfNeeded();
    java.util.List<com.denisk.bullshitbingochampion.WordAndHits> words = getWordsForCard(card);
    if (words == null) {
        return ;
    }
    isEditing = false;
    setDimAndRenderWords(card, words);
}
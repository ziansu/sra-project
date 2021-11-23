@java.lang.Override
public void onRightButtonClick(java.lang.String... strings) {
    int newDeckId = (net.hadifar.dope.storage.BundleDataBaseManager.getInstance().getLastDeckId()) + 1;
    net.hadifar.dope.model.Deck deck = new net.hadifar.dope.model.Deck(newDeckId, strings[0], strings[1], selectedCategoryId);
    net.hadifar.dope.storage.BundleDataBaseManager.getInstance().addToDecks(deck);
    adapter.addItem(deck);
    adapter.notifyDataSetChanged();
    newDeckDialog.dismiss();
}
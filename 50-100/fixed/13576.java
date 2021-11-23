@org.junit.Before
public void setUp() {
    android.content.Intent intent = new android.content.Intent();
    org.mercycorps.translationcards.Deck deck = new org.mercycorps.translationcards.Deck(org.mercycorps.translationcards.TranslationsActivityTest.DEFAULT_DECK_NAME, org.mercycorps.translationcards.TranslationsActivityTest.NO_VALUE, org.mercycorps.translationcards.TranslationsActivityTest.NO_VALUE, org.mercycorps.translationcards.TranslationsActivityTest.DEFAULT_DECK_ID, org.mercycorps.translationcards.TranslationsActivityTest.DEFAULT_LONG);
    intent.putExtra("Deck", deck);
    translationsActivity = org.robolectric.Robolectric.buildActivity(org.mercycorps.translationcards.TranslationsActivity.class).withIntent(intent).create().get();
}
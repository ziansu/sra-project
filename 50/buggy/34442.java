public void onQuoteSelected(boolean selected) {
    if (selected) {
        android.app.FragmentManager fm = getFragmentManager();
        testproject.halfmoonstudios.com.ponder.QuoteFragment quoteFrag = ((testproject.halfmoonstudios.com.ponder.QuoteFragment) (fm.findFragmentById(R.id.fragmentContainer)));
        quoteFrag.setQuoteText();
    }
}
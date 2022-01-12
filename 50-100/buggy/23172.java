@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        return true;
    }
    if (id == (R.id.action_change_units)) {
        com.sam_chordas.android.stockhawk.rest.Utils.showPercent = !(com.sam_chordas.android.stockhawk.rest.Utils.showPercent);
        this.getContentResolver().notifyChange(QuoteProvider.Quotes.CONTENT_URI, null);
    }
    return super.onOptionsItemSelected(item);
}
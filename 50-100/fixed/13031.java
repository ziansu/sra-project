@java.lang.Override
public void onHeaderClick(final com.nervousfish.nervousfish.activities.Header header, final int position) {
    super.onHeaderClick(header, position);
    if ((header.id) == (R.id.key_management_header)) {
        final android.content.Intent intent = new android.content.Intent(this, com.nervousfish.nervousfish.activities.KeyManagementActivity.class);
        this.startActivity(intent);
    }
}
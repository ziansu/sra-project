public void testCompressionFeedback(android.view.View view) {
    android.content.Intent i = new android.content.Intent(getString(R.string.testFilter));
    i.putExtra("mode", "compression");
    i.putExtra("pattern", spinner.getSelectedItemPosition());
    i.putExtra("strength", spinnerStrength.getSelectedItemPosition());
    sendBroadcast(i);
}
private void fillVCardListView(java.util.ArrayList<java.lang.String> cardContent) {
    adapter = new android.widget.ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, cardContent);
    vCardListView.setAdapter(adapter);
    if ((vCardListView.getVisibility()) == (android.view.View.GONE)) {
        vCardListView.setVisibility(View.VISIBLE);
        isVCardTextView.setVisibility(View.GONE);
    }
}
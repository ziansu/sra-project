@java.lang.Override
public void onBindRealmViewHolder(co.moonmonkeylabs.realmrecyclerview.example.MainActivity2.CountryRecyclerViewAdapter.ViewHolder viewHolder, int position) {
    final co.moonmonkeylabs.realmrecyclerview.example.models.CountryModel quoteModel = realmResults.get(position);
    viewHolder.countryTextView.setText(quoteModel.getName());
    viewHolder.countryTextView.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            asyncRemoveCountry(quoteModel.getId());
        }
    });
}
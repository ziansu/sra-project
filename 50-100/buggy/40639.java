public void onItemClick(android.widget.AdapterView<?> parent, android.view.View v, int position, long id) {
    ca.etsmtl.applets.etsmobile.model.Sponsor item = sponsorList.get(position);
    java.lang.String url = item.getUrl();
    android.content.Intent internetIntent = new android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse(url));
    startActivity(internetIntent);
}
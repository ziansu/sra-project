private void bindBreweryToView(android.epsi.com.bebeer.bean.Brewery brewery) {
    android.widget.TextView name = ((android.widget.TextView) (findViewById(R.id.brewery_profil_content_name)));
    android.widget.TextView country = ((android.widget.TextView) (findViewById(R.id.brewery_profil_content_country)));
    name.setText(brewery.getName());
    country.setText(brewery.getCountry());
}
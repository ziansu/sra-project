@java.lang.Override
public void onClick(android.view.View view) {
    android.os.Bundle args = new android.os.Bundle();
    args.putString(getString(R.string.beer_details_uri_key), com.beesham.beerac.service.BeerACIntentService.buildBeerByIdUri(mBeerId));
    android.content.Intent i = new android.content.Intent(this, com.beesham.beerac.ui.DetailsActivity.class);
    i.putExtras(args);
    startActivity(i);
}
@java.lang.Override
public void onClick(android.view.View v) {
    if (!(mClicked)) {
        mClicked = true;
        mNetworking.sendLike(new kamino.starwars.com.kamino.model.Networking.LikeDataListener() {
            @java.lang.Override
            public void onResponseError(java.lang.String errorMessage) {
                android.util.Log.e("response", errorMessage);
                android.widget.Toast.makeText(kamino.starwars.com.kamino.MainActivity.this, errorMessage, Toast.LENGTH_LONG).show();
            }

            @java.lang.Override
            public void onLikeResponseSuccess(kamino.starwars.com.kamino.model.PlanetKamino planetKamino) {
                getPlanetData();
            }
        });
    }
    openResidentList();
}
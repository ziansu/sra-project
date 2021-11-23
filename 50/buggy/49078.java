@java.lang.Override
public void onDialogPositiveClick(br.com.androidzin.brunomateus.beerstodrink.model.Beer beer) {
    beer.setDrinked(false);
    updateDatabase(beer);
    android.util.Log.d(getClass().getSimpleName(), ((beer.getName()) + "was not drinked"));
}
@java.lang.Override
public void onDialogPositiveClick(br.com.androidzin.brunomateus.beerstodrink.model.Beer beer) {
    beer.setDrinked(false);
    updateDatabase(beer);
}
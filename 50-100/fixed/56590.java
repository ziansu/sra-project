@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case 0 :
            addEpoch();
            return true;
        case 1 :
            android.util.Log.i("nk", ("epoch" + (java.lang.Float.toString(xposLong))));
            return true;
    }
    return false;
}
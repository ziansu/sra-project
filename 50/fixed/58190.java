@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String s) {
    br.cin.ufpe.inesescin.smartparking.asyncTasks.BlockLatLngByStoreNameAsync blockLatLngByStoreNameAsync = new br.cin.ufpe.inesescin.smartparking.asyncTasks.BlockLatLngByStoreNameAsync(s, this);
    blockLatLngByStoreNameAsync.execute();
    return false;
}
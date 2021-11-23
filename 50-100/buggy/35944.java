@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_list :
            android.content.Intent intent = new android.content.Intent(this, com.example.guhao.myweather.CityListScrollingActivity.class);
            startActivityForResult(intent, 1);
            break;
        case R.id.id_settings :
            java.lang.String str = ((com.example.guhao.myweather.util.NetworkUtil.isNetworkAvailable(this)) == true) ? "Yes" : "No";
            showShort(str);
            break;
        default :
    }
    return true;
}
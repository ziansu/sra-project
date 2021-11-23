@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.all_category :
            android.widget.Toast toast = android.widget.Toast.makeText(getApplicationContext(), "all_category", Toast.LENGTH_SHORT);
            toast.show();
            return true;
        case R.id.new_product :
            android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.google.android.gms.samples.vision.barcodereader.BarcodeCaptureActivity.class);
            startActivity(intent);
            return true;
    }
    return false;
}
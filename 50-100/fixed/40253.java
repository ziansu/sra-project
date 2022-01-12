public void onBackPressed() {
    android.widget.Toast.makeText(this, "Back is Pressed.", Toast.LENGTH_SHORT).show();
    if ((getFragmentManager().getBackStackEntryCount()) <= 1) {
        finish();
    }else {
        getFragmentManager().popBackStack();
    }
}
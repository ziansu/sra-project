@java.lang.Override
public boolean onOptionsItemSelected(@android.support.annotation.NonNull
android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            getActivity().onBackPressed();
            return true;
        case R.id.save_meal :
            saveMeal();
            return true;
        default :
    }
    return super.onOptionsItemSelected(item);
}
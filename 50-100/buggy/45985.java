@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
        case R.id.actionDelete :
            mPresenter.deletePatient();
            this.getActivity().finish();
        default :
            return super.onOptionsItemSelected(item);
    }
}
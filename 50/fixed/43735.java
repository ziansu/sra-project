@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    tvShowDetailPresenter.seasonSelected((position + 1));
}
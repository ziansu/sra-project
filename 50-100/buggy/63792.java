public void updateTitle() {
    com.bignerdranch.android.scrapbookapp.ItemLab itemLab = com.bignerdranch.android.scrapbookapp.ItemLab.get(getActivity());
    int itemsCount = itemLab.getItems().size();
    java.lang.String title = getString(R.string.title_format, itemsCount);
    android.support.v7.app.AppCompatActivity activity = ((android.support.v7.app.AppCompatActivity) (getActivity()));
    activity.getSupportActionBar().setTitle(title);
}
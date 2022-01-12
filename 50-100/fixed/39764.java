@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    org.jdc.template.App.getInjectComponent(this).inject(this);
    pocketknife.PocketKnife.restoreInstanceState(this, savedInstanceState);
    setHasOptionsMenu(true);
    listView.setChoiceMode((dualPane ? android.widget.ListView.CHOICE_MODE_SINGLE : android.widget.ListView.CHOICE_MODE_NONE));
    listView.setBackgroundResource((dualPane ? R.drawable.listview_dual_background : 0));
    getLoaderManager().restartLoader(0, null, this);
}
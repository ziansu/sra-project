@java.lang.Override
public void onFailGetPartyList(de.dhbw.model.Party[] parties) {
    android.widget.Toast.makeText(getActivity(), "Parties laden ist fehlgeschlagen. Alte Liste wurde geladen.", Toast.LENGTH_SHORT).show();
    mSwipeRefreshLayout.setRefreshing(false);
}
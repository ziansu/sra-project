@java.lang.Override
public void onSuccessGetPartyList(de.dhbw.model.Party[] parties) {
    adaptParties(parties);
    if ((getActivity()) != null) {
        android.widget.Toast.makeText(getActivity(), "Parties wurden erfolgreich geladen", Toast.LENGTH_SHORT).show();
        mSwipeRefreshLayout.setRefreshing(false);
    }
}
@java.lang.Override
public void onSuccessGetPartyList(de.dhbw.model.Party[] parties) {
    adaptParties(parties);
    if ((getActivity()) != null) {
        android.widget.Toast.makeText(getActivity(), "Parties wurden erfolgreich geladen", Toast.LENGTH_SHORT).show();
        mSwipeRefreshLayout.setRefreshing(false);
        if ((error_header.getVisibility()) == (android.view.View.VISIBLE)) {
            error_header.startAnimation(error_fade_out);
            error_header.setVisibility(View.INVISIBLE);
            error_header.setClickable(false);
        }
    }
}
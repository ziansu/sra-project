@java.lang.Override
public void onClick(android.view.View pView) {
    if (mTournament.getTurnirUUID().toString().equals(null)) {
        android.widget.Toast newToast = android.widget.Toast.makeText(getContext(), mTournament.getDate(), Toast.LENGTH_SHORT);
        newToast.show();
    }else {
        android.content.Intent intent = com.example.korisnik.androidtestproject.TournamentFragment.newIntent(getContext(), mTournament.getTurnirUUID().toString());
        startActivity(intent);
    }
}
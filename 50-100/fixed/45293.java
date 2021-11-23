private void initView(final android.view.View view) {
    btnCreatedLeague = ((android.widget.Button) (view.findViewById(R.id.fragment_my_league_btn_created)));
    btnJoinedLeague = ((android.widget.Button) (view.findViewById(R.id.fragment_my_league_btn_joined)));
    btnCreatedLeague.setOnClickListener(this);
    btnJoinedLeague.setOnClickListener(this);
    com.ipl.utils.Utils.replaceFragment(getActivity(), new com.ipl.fragment.CreatedLeagueFragment(), R.id.fragment_my_league_container);
}
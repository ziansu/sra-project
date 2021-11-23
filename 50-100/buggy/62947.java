public void showSignInBar() {
    mMainView.findViewById(R.id.activity_main_button_signin).setVisibility(View.VISIBLE);
    mMainView.findViewById(R.id.activity_main_view_gameseparator).setVisibility(View.GONE);
    mMainView.findViewById(R.id.activity_main_button_achievements).setVisibility(View.GONE);
    mMainView.findViewById(R.id.activity_main_button_leaderboard).setVisibility(View.GONE);
}
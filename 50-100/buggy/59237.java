private void setUpAdmob() {
    if (com.android.heaton.funnyvote.ui.votedetail.VoteDetailContentActivity.ENABLE_ADMOB) {
        com.google.android.gms.ads.AdRequest adRequest = new com.google.android.gms.ads.AdRequest.Builder().setGender((((user) != null) && (user.getGender().equals(User.GENDER_MALE)) ? com.google.android.gms.ads.AdRequest.GENDER_MALE : com.google.android.gms.ads.AdRequest.GENDER_FEMALE)).build();
        adView.loadAd(adRequest);
    }else {
        adView.setVisibility(View.GONE);
    }
}
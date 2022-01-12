private void initialSetFavImage() {
    com.google.firebase.auth.FirebaseUser user = com.google.firebase.auth.FirebaseAuth.getInstance().getCurrentUser();
    if (user == null) {
        mFavStatusImageView.setImageResource(R.drawable.unfav);
    }else {
        mFavStatus = mQuestion.getFav();
        android.util.Log.d("Favstatus", mFavStatus);
        if (mFavStatus.equals("true")) {
            mFavStatusImageView.setImageResource(R.drawable.fav);
        }else {
            mFavStatusImageView.setImageResource(R.drawable.unfav);
        }
    }
}
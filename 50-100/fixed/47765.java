@java.lang.Override
public void done(com.tatparya.proximate.ParseException e) {
    if (e == null) {
        receiveMessage();
        int score = ((int) (mCurrentUser.get(ParseConstants.KEY_USER_SCORE)));
        mCurrentUser.put(ParseConstants.KEY_USER_SCORE, (score + 1));
        mCurrentUser.saveInBackground();
    }
}
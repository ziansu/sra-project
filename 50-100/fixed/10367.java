private void incrementScore() {
    (com.syzible.irishnoungenders.fragments.MainFrag.currentScore)++;
    highScoreTV.setText(java.lang.String.valueOf(com.syzible.irishnoungenders.fragments.MainFrag.currentScore));
    if ((com.syzible.irishnoungenders.fragments.MainFrag.currentScore) > (com.syzible.irishnoungenders.utils.LocalStorage.getHighScore(getActivity()))) {
        com.syzible.irishnoungenders.utils.LocalStorage.setHighScore(getActivity(), com.syzible.irishnoungenders.fragments.MainFrag.currentScore);
        if (!(hasAnimatedNewHighScore)) {
            hasAnimatedNewHighScore = true;
            com.syzible.irishnoungenders.utils.PulseAnimation.animateView(highScoreTV);
        }
    }
}
private void headFollowHand() {
    if (!(bHeadIsFollowHand)) {
        if (sScoreLabel.equals("measure1")) {
            HeadFollowHandSwitcher(true);
        }else
            if (sScoreLabel.equals("e3")) {
                HeadFollowHandSwitcher(false);
            }
        
    }
}
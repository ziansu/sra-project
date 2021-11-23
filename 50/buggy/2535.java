public void goldButtonClick() {
    moveOffScreen(goldButton);
    goldEarnedByRandom = (jakemcdowell.blobsapplication.Constants.goldAddedPerLevel) / (game.getLevel());
    goldearnedbylevel = (goldearnedbylevel) + (goldEarnedByRandom);
}
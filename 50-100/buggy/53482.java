private void readyLabel() {
    float fontSize = (stage.getHeight()) * (com.mygdx.osc.HighScore.fontScaleConst);
    setFontScale(fontSize);
    setAlignment(0, 8);
    setY(((stage.getHeight()) * 0.95F));
    setX(((stage.getWidth()) * 0.9F));
    highScore = com.mygdx.osc.playerdata.GlobalPlayerData.getHighScore();
    setText(java.lang.Integer.toString(highScore));
}
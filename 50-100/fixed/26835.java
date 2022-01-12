private void readyLabel() {
    float fontSize = (stage.getHeight()) * (com.mygdx.osc.CurrentScore.fontScaleConst);
    setFontScale(fontSize);
    setX(((stage.getWidth()) * 0.01F));
    setY(((stage.getHeight()) * 0.95F));
    setText(java.lang.Integer.toString(currentScore));
}
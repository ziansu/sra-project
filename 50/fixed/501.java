private int getScoreValue() {
    if ((scoreLabel) == null)
        return 0;
    
    return java.lang.Integer.valueOf(scoreLabel.getText().toString());
}
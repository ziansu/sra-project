public boolean validateWager() {
    final java.lang.String value = wagerText.getText().toString();
    final java.lang.Long bet;
    if (value.isEmpty())
        return false;
    
    bet = java.lang.Long.parseLong(value);
    if (bet > (this.score.getScore()))
        return false;
    
    return true;
}
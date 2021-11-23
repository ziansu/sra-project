public void setBrewTime(int minutes) {
    if (isBrewing)
        return ;
    
    brewTime = (minutes < 1) ? 1 : minutes;
    leftBrewTimeInSec = (brewTime) * 60;
    brewTimeLabel.setText(((java.lang.String.valueOf(brewTime)) + "m"));
}
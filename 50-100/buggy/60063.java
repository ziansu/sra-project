public void setBrewTime(int minutes) {
    if (isBrewing)
        return ;
    
    brewTime = minutes;
    leftBrewTimeInSec = (brewTime) * 60;
    if ((brewTime) < 1)
        brewTime = 1;
    
    brewTimeLabel.setText(((java.lang.String.valueOf(brewTime)) + "m"));
}
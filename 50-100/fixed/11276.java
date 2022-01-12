private void setSpotColor(javax.swing.JButton buttonToChange, java.lang.String playerNameOnSpot) {
    if ((playerNameOnSpot == null) || ("".equals(playerNameOnSpot))) {
        buttonToChange.setIcon(null);
    }else
        if (myPlayerController.getPlayer1Name().equals(playerNameOnSpot)) {
            buttonToChange.setIcon(black_icon);
        }else
            if (myPlayerController.getPlayer2Name().equals(playerNameOnSpot)) {
                buttonToChange.setIcon(red_icon);
            }
        
    
}
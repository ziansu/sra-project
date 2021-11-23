public void changePlayerNameToYou(java.lang.String playerName) {
    if (!(playersDetail.isEmpty())) {
        int i = 0;
        while ((!(playersDetail.get(i).getPlayerName().equals(playerName))) && (i < ((playersDetail.size()) - 1))) {
            i++;
        } 
        playersDetail.get(i).setPlayerName("You");
    }
}
private static void updateKillDeathRatio() {
    int i;
    int gcm;
    int first = com.hotmail.kalebmarc.textfighter.player.Stats.totalKills;
    int second = Health.timesDied;
    i = (first >= second) ? first : second;
    while (i != 0) {
        if (((first % i) == 0) && ((second % i) == 0)) {
            gcm = i;
            break;
        }
        i--;
    } 
    com.hotmail.kalebmarc.textfighter.player.Stats.killDeathRatio = ((first / gcm) + ":") + (second / gcm);
}
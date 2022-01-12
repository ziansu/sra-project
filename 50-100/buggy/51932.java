public void resolveGame() {
    if (campaign.checkCampaignComplete()) {
        displayVictoryPanel();
    }else {
        toggleActive();
        campaign.allies = ally;
        campaign.advance();
        if ((campaign.currentBattle) == 0) {
            for (int i = 0; i < (ally.size()); i++) {
                ally.get(i).promoted = false;
            }
        }
    }
}
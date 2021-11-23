@java.lang.Override
public void onGameStart() {
    getContext().alliance(1, 1);
    getContext().alliance(2, 1);
    net.toyknight.aeii.campaign.Message message = new net.toyknight.aeii.campaign.Message(5, net.toyknight.aeii.utils.Language.getText("CAMPAIGN_CHALLENGE_STAGE_6_MESSAGE_1"));
    getContext().message(message);
}
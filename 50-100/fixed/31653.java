public void newDialog() {
    dialogue = new com.superschmalgames.Utilities.CharacterDialogue("Let's Talk!", com.superschmalgames.Utilities.Utils.dialSkin);
    dialogue.show(Utils.dialStage);
    dialogue.setPosition((((com.superschmalgames.Utilities.Utils.GAME_SCREEN_WIDTH) / 2) - ((dialogue.getWidth()) / 2)), 0);
}
public void saveSettings() {
    com.mygdx.game.dataPersistence.DataPers.dataH().setSlot1(slot1.getItemId());
    com.mygdx.game.dataPersistence.DataPers.dataH().setSlot2(slot2.getItemId());
    com.mygdx.game.dataPersistence.DataPers.dataH().setCurrentSkin(skinSlots.get(currentSkin).getSkinId());
    com.mygdx.game.dataPersistence.DataPers.saveH();
    java.lang.System.out.println(("Settings saved... current skin: " + (com.mygdx.game.dataPersistence.DataPers.dataH().getCurrentSkin())));
}
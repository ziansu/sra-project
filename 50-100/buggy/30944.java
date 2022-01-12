private static void setBattlefield(model.battlefield.Battlefield battlefield) {
    if (battlefield != null) {
        model.ModelManager.battlefield = battlefield;
        model.battlefield.map.parcel.ParcelManager.createParcelMeshes(model.ModelManager.getBattlefield().getMap());
        model.ModelManager.battlefieldReady = true;
        model.ModelManager.getBattlefield().getMap().resetTrinkets();
        model.ModelManager.getBattlefield().getEngagement().reset();
        event.EventManager.post(new event.BattleFieldUpdateEvent());
        LogUtil.logger.info("Done.");
    }
}
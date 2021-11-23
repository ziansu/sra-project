public boolean equip(cards.EquipSlot slot, cards.Equipment card) {
    if (slot == (cards.EquipSlot.hand)) {
        slot = (firstHandOld) ? cards.EquipSlot.hand1 : cards.EquipSlot.hand2;
        firstHandOld = !(firstHandOld);
    }
    game.Decks.discardCard(equipments.put(slot, card));
    game.GameManager.broadcastMessage(new network.message.server.PlayerEquipmentMessage(this));
    game.GameManager.broadcastMessage(new network.message.server.PlayerFullStatsMessage(this));
    return true;
}
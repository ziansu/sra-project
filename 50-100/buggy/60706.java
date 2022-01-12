@java.lang.Override
public at.fhv.ohe.miniMud.map.Fields.Field enter(at.fhv.ohe.miniMud.map.Player player) throws at.fhv.ohe.miniMud.map.Fields.IllegalFieldEnterException {
    if (!(isTheDoorOpenfor(player))) {
        for (at.fhv.ohe.miniMud.map.Items.Items item : player.getAllItemsfromType(at.fhv.ohe.miniMud.map.Items.Key.class)) {
            if ((_keyID) == (((at.fhv.ohe.miniMud.map.Items.Key) (item)).getKeyID())) {
                openDoorFor(player);
                player.deleteFromInventory(item);
                return this;
            }
        }
        player.playerOutputStream(at.fhv.ohe.miniMud.map.Fields.Door._ONNOKEYCLOSED);
    }
    return this;
}
public static void setFieldOwner(controller.Player player, int fieldNumber) {
    if (player == null) {
        desktop_resources.GUI.removeOwner(fieldNumber);
    }else {
        desktop_resources.GUI.setOwner(fieldNumber, player.getName());
    }
}
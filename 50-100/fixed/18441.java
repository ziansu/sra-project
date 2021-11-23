private static void resetSign(theweekend.minigames.slots.SlotMachine slotMachine) {
    if ((slotMachine.getSignTask()) != null) {
        org.bukkit.Bukkit.getScheduler().cancelTask(slotMachine.getSignTask());
        slotMachine.setSignTask(null);
    }
    org.bukkit.block.Sign sign = ((org.bukkit.block.Sign) (slotMachine.getSignBlock().getState()));
    for (int i = 0; i < 4; i++) {
        sign.setLine(i, "");
    }
    sign.update();
}
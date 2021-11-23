public void run() {
    try {
        java.lang.Thread.sleep(3500);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    player.setHealth(java.lang.Math.min(100, ((player.getHealth()) + (consumable.getEffectValue()))));
    consumable.removeDurability();
    if ((consumable.getDurability()) <= 0) {
        player.removeItem(player.getSelectedItem());
    }
}
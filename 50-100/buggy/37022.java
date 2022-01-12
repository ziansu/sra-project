private boolean gmallTest(org.bukkit.entity.Player p, int which) {
    switch (which) {
        case 0 :
            return p.getGameMode().equals(GameMode.SURVIVAL);
        case 1 :
            return p.getGameMode().equals(GameMode.ADVENTURE);
        case 2 :
            return p.isFlying();
        case 3 :
            return p.getGameMode().equals(GameMode.CREATIVE);
        case 4 :
            return p.isOp();
    }
    return false;
}
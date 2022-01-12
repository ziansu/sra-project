private boolean isStorage(org.bukkit.Material m) {
    switch (m) {
        case CHEST :
            return true;
        case HOPPER :
            return true;
        case TRAPPED_CHEST :
            return true;
        case DISPENSER :
            return true;
        case DROPPER :
            return true;
        case BREWING_STAND :
            return true;
        default :
            return false;
    }
}
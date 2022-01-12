public void setGameMode(com.laytonsmith.abstraction.MCGameMode mode) {
    switch (mode) {
        case SURVIVAL :
            p.setGameMode(GameMode.SURVIVAL);
            break;
        case CREATIVE :
            p.setGameMode(GameMode.CREATIVE);
            break;
    }
}
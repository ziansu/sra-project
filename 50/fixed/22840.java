private boolean tryToPass(java.util.List<AI.Player> receivers) {
    for (AI.Player p : receivers) {
        if (makePass(p, true)) {
            return true;
        }
    }
    return false;
}
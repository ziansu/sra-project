private java.util.List<java.lang.Integer> getRunLengths(java.util.List<com.brookmanholmes.billiards.player.AbstractPlayer> players) {
    java.util.List<java.lang.Integer> result = new java.util.ArrayList<>();
    for (com.brookmanholmes.billiards.player.AbstractPlayer player : players) {
        if (player instanceof com.brookmanholmes.billiards.player.StraightPoolPlayer)
            result.addAll(((com.brookmanholmes.billiards.player.StraightPoolPlayer) (player)).getRunLengths());
        
    }
    return result;
}
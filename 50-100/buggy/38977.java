public javafx.geometry.Side getLastMove(java.lang.Integer key) {
    java.lang.Integer finalKey = ((moveHistory.size()) - 1) - key;
    while ((finalKey = ((moveHistory.size()) - 1) - key) < 0) {
        key--;
    } 
    try {
        return moveHistory.get(finalKey);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}
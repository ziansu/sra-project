public java.lang.String getString(int move) {
    switch (this) {
        case LEFT_ATK_LEFT :
            return move == (StickState2H.MAX_TURN) ? "0 2" : "2 0";
        case LEFT_ATK_RIGHT :
            return move == (StickState2H.MAX_TURN) ? "0 3" : "3 0";
        case RIGHT_ATK_LEFT :
            return move == (StickState2H.MAX_TURN) ? "1 2" : "2 1";
        case RIGHT_ATK_RIGHT :
            return move == (StickState2H.MAX_TURN) ? "1 3" : "3 1";
    }
    throw new java.lang.RuntimeException("invalid state of enum for toString");
}
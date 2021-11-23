public static synchronized java.lang.Integer get() {
    Chord_Battleship.TransactionID.getInstance().printChange();
    return Chord_Battleship.TransactionID.getInstance().id;
}
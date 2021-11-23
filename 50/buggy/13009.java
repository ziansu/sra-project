public static synchronized void inc() {
    Chord_Battleship.TransactionID.getInstance().printChange();
    (Chord_Battleship.TransactionID.getInstance().id)++;
}
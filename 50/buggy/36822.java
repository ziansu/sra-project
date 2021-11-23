public static void main(java.lang.String[] args) {
    Stove stove = new Stove();
    stove.displayStove();
    for (Burner burner : stove.burners) {
        stove.increaseSetting(burner);
    }
    stove.displayStove();
}
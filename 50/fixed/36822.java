public static void main(java.lang.String[] args) {
    Stove stove = new Stove();
    stove.displayStove();
    for (Burner burner : stove.burners) {
        burner.increaseSetting(burner);
    }
    stove.displayStove();
}
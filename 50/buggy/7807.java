public void playHand() {
    int handId = rand.nextInt(3);
    java.lang.System.out.println(("Computer plays " + handId));
    int handError = setHandFromId(handId);
    if (handError != 0) {
        java.lang.System.out.println("This should be an exception!");
    }
}
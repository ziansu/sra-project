public void swapCards(int swapRound) {
    for (int i = 0; i < 4; i++) {
        manager.swapCards(chosenLists.get(i), i, swapRound);
        manager.getPlayers()[i].organize();
    }
    finishedSwapping = true;
    findStartPlayer();
    java.lang.System.out.println(this.currentPlayerInteracting);
}
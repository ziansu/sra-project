private void makeOrChangeBid(java.util.Scanner scanner, refactored.DisplayCalendar cal) {
    java.lang.System.out.println("You are about to make or change a bid!");
    listAuctions(cal);
    int pickAuc = scanner.nextInt();
    refactored.Auction chosenAuc = chooseAuction(pickAuc, cal);
    if (chosenAuc != null) {
        listItems(chosenAuc);
        int pickItem = scanner.nextInt();
        refactored.Item chosenItem = chooseItem(chosenAuc);
        nextAction(scanner, chosenAuc, chosenItem);
    }
}
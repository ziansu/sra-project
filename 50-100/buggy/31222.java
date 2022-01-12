private void makeMovement(java.util.Scanner scanner, es.mikel.tictactoe.Vector2 desiredPosition) {
    if ((((desiredPosition.getX()) != (-1)) && ((desiredPosition.getY()) != (-1))) && (currentGame.getMapManager().canChangePositionValue(desiredPosition))) {
        currentGame.getMapManager().changePositionValue(desiredPosition, "X");
    }else {
        java.lang.System.out.println("That's not a valid position.");
        scanner.nextLine();
    }
}
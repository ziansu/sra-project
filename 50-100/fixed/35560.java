@org.junit.Test
public void MoveFromDeckToWasteTest() {
    main.MoveCardController moveCardController1 = new main.MoveCardController(24, 0);
    main.MoveCardController moveCardController2 = new main.MoveCardController(3, 0);
    main.MoveCardController moveCardController3 = new main.MoveCardController(2, 0);
    main.MoveCardController moveCardController4 = new main.MoveCardController(1, 0);
    main.MoveCardController moveCardController5 = new main.MoveCardController(0, 0);
    int initialDeckSize1 = moveCardController1.getDeckSize();
    moveCardController1.moveFromDeckToWaste();
}
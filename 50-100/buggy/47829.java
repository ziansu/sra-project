private void howToMove() {
    CIT260.crashInTheCaribbean.view.HowToMove move = new CIT260.crashInTheCaribbean.view.HowToMove();
    try {
        move.display();
    } catch (CIT260.crashInTheCaribbean.exceptions.HowToMoveException mve) {
        java.lang.System.out.println(mve.getMessage());
    } catch (java.lang.Throwable how) {
        java.lang.System.out.println(move.howMessage());
    }
}
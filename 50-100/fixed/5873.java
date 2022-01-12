@org.junit.Test
public void playGame() {
    java.lang.System.out.println((("Round " + 1) + ":"));
    playRound();
    if ((player1.Score()) > (player2.Score())) {
        java.lang.System.out.println("Player 1 wins.");
    }else
        if ((player1.Score()) < (player2.Score())) {
            java.lang.System.out.println("Player 2 wins.");
        }else {
            java.lang.System.out.println("Draw.");
        }
    
}
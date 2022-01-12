public int scoreBoard() {
    switch (game.max) {
        case "W" :
            score = (scoreWhite()) - (scoreBlack());
            break;
        case "B" :
            score = (scoreBlack()) - (scoreWhite());
            break;
        default :
            break;
    }
}
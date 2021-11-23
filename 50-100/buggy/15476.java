public java.lang.String checkYourself(java.lang.String stringGuess) {
    int guess = java.lang.Integer.parseInt(stringGuess);
    java.lang.String result = "miss";
    for (int cell : locationCells) {
        if (guess == cell) {
            result = "hit";
            (numOfHits)++;
            break;
        }
    }
    if ((numOfHits) == (locationCells.length)) {
        result = "kill";
    }
    java.lang.System.out.println(result);
    return result;
}
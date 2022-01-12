public java.lang.String checkYourself(java.lang.String stringGuess) {
    int guess = java.lang.Integer.parseInt(stringGuess);
    java.lang.String result = "miss";
    for (int i = 0; i < (locationCells.length); i++) {
        if (guess == (locationCells[i])) {
            result = "hit";
            (numOfHits)++;
            locationCells[i] = -1;
            break;
        }
    }
    if ((numOfHits) == (locationCells.length)) {
        result = "kill";
    }
    java.lang.System.out.println(result);
    return result;
}
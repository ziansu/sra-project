public java.lang.String checkYourSelf(java.lang.String value) {
    int guessValue = java.lang.Integer.parseInt(value);
    java.lang.String result = "miss";
    for (int location : locations) {
        if (guessValue == location) {
            result = "hit";
            (numOfHits)++;
        }
    }
    if ((numOfHits) == (locations.length)) {
        result = "kill";
    }
    java.lang.System.out.println(result);
    return result;
}
public static int randomSquare(java.util.ArrayList<java.lang.Integer> squaresList) {
    java.util.Random random = new java.util.Random();
    int randomNumber = 0;
    if ((squaresList.size()) == 0) {
        return -1;
    }else
        if ((squaresList.size()) > 1) {
            randomNumber = random.nextInt(((squaresList.size()) - 1));
        }
    
    int randomSquare = squaresList.get(randomNumber);
    return randomSquare;
}
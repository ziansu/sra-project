public static double squareRoot(double squaredNumber, double error) {
    double guess = squaredNumber / 2;
    double errorTolerance = squaredNumber - (guess * guess);
    if (errorTolerance >= error) {
        return SquareGuessing.error(squaredNumber, guess, error);
    }else {
        return guess;
    }
}
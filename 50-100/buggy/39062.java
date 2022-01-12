private static boolean isValid() {
    if (((((run.OrientationBruteSolver.alreadyChecked()) || (run.OrientationBruteSolver.tooManyDigits())) || (run.OrientationBruteSolver.notEnoughTiles())) || (run.OrientationBruteSolver.invalidZeros())) || (run.OrientationBruteSolver.tooManyZeros())) {
        return false;
    }
    return true;
}
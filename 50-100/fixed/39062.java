private static boolean isValid() {
    if (((((run.OrientationBruteSolver.alreadyChecked()) || (run.OrientationBruteSolver.notEnoughTiles())) || (run.OrientationBruteSolver.invalidZeros())) || (run.OrientationBruteSolver.tooManyZeros())) || (run.OrientationBruteSolver.tooManyDigits())) {
        return false;
    }
    return true;
}
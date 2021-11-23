private static double mintermCountUpperBound(espresso.boolFunction.Cover cover) {
    double retValue = 0;
    for (espresso.boolFunction.cube.Cube cube : cover) {
        int dontcareCount = 0;
        for (int i = 0; i < (cube.inputLength()); ++i) {
            if ((cube.getInputState(i)) == (espresso.boolFunction.InputState.DONTCARE)) {
                ++dontcareCount;
            }
        }
        retValue += java.lang.Math.pow(2, dontcareCount);
    }
    return retValue;
}
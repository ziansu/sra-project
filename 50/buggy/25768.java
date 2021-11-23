@java.lang.Override
public void clears() {
    this.firstInput = 0;
    this.secondInput = 0;
    this.output = 0;
    this.currentState = com.bigfoot.javacalc.DoubleCalcModel1.State.SAW_CLEAR;
    this.currentMode = com.bigfoot.javacalc.DoubleCalcModel1.Mode.NULL;
    this.firstOrSecond = true;
}
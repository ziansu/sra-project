public void BMI(char operand) {
    if ((n) == 1) {
        tick();
        pc += operand;
        if ((((pc) - operand) & 3840) != ((pc) & 3840)) {
            tick();
        }
    }
}
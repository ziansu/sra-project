public void BCS(char operand) {
    if ((c) == 1) {
        tick();
        pc += operand;
        if ((((pc) - operand) & 3840) != ((pc) & 3840)) {
            tick();
        }
    }
}
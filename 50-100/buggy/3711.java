public void BEQ(char operand) {
    if ((z) == 1) {
        tick();
        pc += operand;
        if ((((pc) - operand) & 3840) != ((pc) & 3840)) {
            tick();
        }
        pc -= 2;
    }
}
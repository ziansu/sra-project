public void BCC(char operand) {
    if ((c) == 0) {
        tick();
        pc += operand;
        if ((((pc) - operand) & 3840) != ((pc) & 3840)) {
            tick();
        }
        pc -= 2;
    }
}
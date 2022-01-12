public void BVC(char operand) {
    if ((v) == 0) {
        tick();
        pc += operand;
        if ((((pc) - operand) & 3840) != ((pc) & 3840)) {
            tick();
        }
    }
}
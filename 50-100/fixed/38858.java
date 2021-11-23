public int apply() {
    int i2 = (pc) + (di ? reg[i] : i);
    if (i2 >= (prog.size())) {
        return (pc) + 1;
    }
    prog.set(i2, prog.get(i2).toggle());
    return (pc) + 1;
}
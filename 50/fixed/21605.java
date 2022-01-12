public programReduction.Paths pop() {
    if ((this) == (programReduction.Paths.empty)) {
        return programReduction.Paths.empty;
    }
    return this.next;
}
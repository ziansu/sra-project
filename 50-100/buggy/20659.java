public int getLine(int index) {
    for (int i = 0; i <= (this.max_line); i++) {
        if ((this.line_indices[i]) <= index) {
            return i;
        }
    }
    return this.max_line;
}
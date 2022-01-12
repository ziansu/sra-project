@java.lang.Override
public void write(int b) throws java.io.IOException {
    if ((written) == (lineWidth)) {
        out.write(eolBytes);
        written = 0;
    }
    out.write(b);
    (written)++;
}
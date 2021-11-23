@java.lang.Override
public void write(int c) throws java.io.IOException {
    if (firstChar) {
        out.write(((((counter)++) + "\t") + c));
        firstChar = false;
    }else {
        out.write(c);
    }
    if ((c == '\n') || (c == '\r')) {
        firstChar = true;
    }
    prevChar = c;
}
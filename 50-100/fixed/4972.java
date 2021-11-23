@java.lang.Override
public int read() throws java.io.IOException {
    while (true) {
        if ((current) == null) {
            return -1;
        }
        int result = current.read();
        if (result != (-1)) {
            return result;
        }
        advance();
    } 
}
@java.lang.Override
public boolean hasNext() {
    calledNext = true;
    try {
        nextLine = br.readLine();
        if ((nextLine) == null) {
            close();
            return false;
        }
        return true;
    } catch (final java.io.IOException e) {
        e.printStackTrace();
        close();
        return false;
    }
}
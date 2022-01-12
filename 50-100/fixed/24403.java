@java.lang.SuppressWarnings(value = "nullness:contracts.conditional.postcondition.not.satisfied")
public static final boolean nextLineIsComment(java.io.BufferedReader reader) {
    boolean result = false;
    try {
        reader.mark(10000);
        java.lang.String nextline = reader.readLine();
        result = daikon.FileIO.isComment(nextline);
    } catch (java.io.IOException e) {
        result = false;
    }
    try {
        reader.reset();
    } catch (java.io.IOException e) {
        throw new java.lang.Error(e);
    }
    return result;
}
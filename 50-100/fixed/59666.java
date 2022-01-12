@java.lang.Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    if ((bufferedWriter) != null) {
        result = (prime * result) + (bufferedWriter.hashCode());
    }
    if ((format) != null) {
        result = (prime * result) + (format.hashCode());
    }
    return result;
}
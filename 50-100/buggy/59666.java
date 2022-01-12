@java.lang.Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result;
    if ((bufferedWriter) != null) {
        result = result + (bufferedWriter.hashCode());
    }
    if ((format) == null) {
        return result;
    }else {
        return result + (format.hashCode());
    }
}
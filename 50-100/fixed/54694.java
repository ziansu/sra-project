@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder result = new java.lang.StringBuilder();
    for (int i = 0; i < (this.labels.size()); i++) {
        result.append(getPieLabelRecord(i).toString()).append("\n");
    }
    return result.toString();
}
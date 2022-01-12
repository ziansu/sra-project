@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder output = new java.lang.StringBuilder("[");
    for (com.jeremydeanlakey.json.Json item : values) {
        output.append(item.toString());
        output.append(",");
    }
    output.append("]");
    return output.toString();
}
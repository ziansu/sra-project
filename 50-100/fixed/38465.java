@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder output = new java.lang.StringBuilder("[");
    boolean first = true;
    for (com.jeremydeanlakey.json.Json item : values) {
        if (!first)
            output.append(",");
        
        first = false;
        output.append(item.toString());
    }
    output.append("]");
    return output.toString();
}
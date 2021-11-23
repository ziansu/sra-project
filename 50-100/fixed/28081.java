public static freditor.vector.IntVector of(int... values) {
    int len = values.length;
    if (len == 0)
        return freditor.vector.IntVector.empty;
    
    if (len <= 32)
        return new freditor.vector.IntVector1(len, java.util.Arrays.copyOf(values, 32));
    
    freditor.vector.IntVector temp = freditor.vector.IntVector.empty;
    for (int x : values) {
        temp = temp.push(x);
    }
    return temp;
}
@java.lang.Override
public <T extends java.lang.Comparable<T>> T[] sort(T[] inputArray) {
    return sortArray(inputArray, ( x, y) -> {
        return x.compareTo(y);
    });
}
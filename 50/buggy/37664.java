@org.jetbrains.annotations.NotNull
public int[] toArray() {
    int[] result = new int[mySize];
    java.lang.System.arraycopy(myData, 0, result, 0, mySize);
    return result;
}
private void expand() {
    final int newSize = (stackVector.length) * 2;
    final T[] newArray = ((T[]) (new java.lang.Object[newSize]));
    for (int i = 0; i < (head); i++)
        newArray[i] = stackVector[i];
    
    stackVector = newArray;
}
public void sort(int[] array) {
    if (array == null)
        throw new java.lang.NullPointerException("Array value cannot be null");
    
    this.array = array;
    this.length = array.length;
    if ((length) == 1)
        return ;
    
    quickSort(0, length);
}
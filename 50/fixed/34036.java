@java.lang.Override
public int[] getDataFieldArray() {
    if ((dataArray) == null) {
        dataArray = new int[(numberOfInputSlots()) + 1];
    }
    return dataArray;
}
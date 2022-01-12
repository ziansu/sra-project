@java.lang.Override
public void delete(int pValueToDelete) {
    int n = find(pValueToDelete);
    if ((n != 0) && ((sizeOfList) > 0)) {
        for (int i = n; i < ((sizeOfList) - 1); i++) {
            listItems[i] = listItems[(i + 1)];
        }
        (sizeOfList)--;
    }
}
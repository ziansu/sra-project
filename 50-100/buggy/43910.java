private void extend(int minimumSize) {
    int newSize = ((int) ((storage.length) * (multiplicator)));
    if (newSize < minimumSize)
        newSize = minimumSize;
    
    de.tremoneck.timemachine.storage.ReferenceStorage.ReferenceFile[] temp = new de.tremoneck.timemachine.storage.ReferenceStorage.ReferenceFile[newSize];
    java.lang.System.arraycopy(storage, 0, temp, 0, storage.length);
    storage = temp;
}
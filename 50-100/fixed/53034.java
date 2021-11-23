private int removeFile(int n) {
    if ((userInterface.OpenFile.i) < 1)
        return -1;
    
    for (int j = n; n < ((userInterface.OpenFile.i) - 1); j++) {
        userInterface.OpenFile.file[j] = userInterface.OpenFile.file[(j + 1)];
    }
    userInterface.OpenFile.file[userInterface.OpenFile.i] = null;
    (userInterface.OpenFile.i)--;
    return 0;
}
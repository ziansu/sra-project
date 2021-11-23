private int GetTargetByte(int cipher, int key) {
    int retval;
    retval = cipher ^ key;
    if (retval < 0) {
    }
    retval = inverseSBox[retval];
    return retval;
}
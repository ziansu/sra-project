byte[] getHeapItem(org.pipoware.pst.exp.HID hid) {
    int hidIndex = hid.hidIndex;
    com.google.common.base.Preconditions.checkArgument((hidIndex > 0), "hidIndex (%s) must be > 0 ", hidIndex);
    com.google.common.base.Preconditions.checkArgument((hidIndex < ((rgibAlloc.length) + 1)), "hidIndex (%s) out of rgiAlloc size (%s)", rgibAlloc.length);
    int rgiAllocIndex = hidIndex - 1;
    return java.util.Arrays.copyOfRange(data, rgibAlloc[rgiAllocIndex], rgibAlloc[(rgiAllocIndex + 1)]);
}
@java.lang.Override
public void fillBytesAsInts(int[] toBeFilled) {
    byte[] result = new byte[toBeFilled.length];
    fillBytes(result);
    for (int i = 0; i < (toBeFilled.length); i++) {
        toBeFilled[i] = (result[i]) % 256;
    }
}
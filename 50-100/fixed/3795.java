private static boolean[] stringToInstrBitArray(java.lang.String s, char magicChar, boolean not) {
    boolean[] arr = new boolean[ch.hszt.kfh.compost.Compost.INSTR_SIZE];
    for (int i = 0; i < (arr.length); i++) {
        arr[i] = (s.charAt(i)) == magicChar;
        if (not) {
            arr[i] = !(arr[i]);
        }
    }
    return arr;
}
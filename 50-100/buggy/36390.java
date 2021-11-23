static int[] getArrayPosition(java.lang.Long key) {
    if (key == null) {
        throw new java.lang.NullPointerException("Key may not be null.");
    }
    final int firstIndex = ((int) ((key & -65536) >> 32));
    final int secondIndex = ((int) (key & 65535));
    if (0 < secondIndex) {
        return new int[]{ firstIndex };
    }else {
        return new int[]{ firstIndex , secondIndex };
    }
}
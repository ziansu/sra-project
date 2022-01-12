static int[] getArrayPosition(java.lang.Long key) {
    if (key == null) {
        throw new java.lang.NullPointerException("Key may not be null.");
    }
    final int firstIndex = ((int) ((key & -65536) >> 32));
    final int secondIndex = ((int) (key & 65535));
    if ((-1) < firstIndex) {
        return new int[]{ firstIndex , secondIndex };
    }else {
        return new int[]{ secondIndex };
    }
}
public int getNumNonNBases(final int start, final int end) {
    int count = 0;
    for (int index = start; index < end; index++) {
        if (!(com.bina.varsim.types.Sequence.isN(_seq[index])))
            count++;
        
    }
    return count;
}
@java.lang.Override
public float getCompletedProgress() {
    int count = 0;
    for (int i = 0; i < (pieces.size()); i++) {
        if (pieces.get(i).isEqualNum(i))
            count++;
        
    }
    return count / (pieces.size());
}
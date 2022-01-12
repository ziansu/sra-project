@java.lang.Override
public float getCompletedProgress() {
    int count = 0;
    for (int i = 0; i < (pieces.size()); i++) {
        if (pieces.get(i).isEqualNum(i))
            count++;
        
    }
    return (1.0F * count) / (pieces.size());
}
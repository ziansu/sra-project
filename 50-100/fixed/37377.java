@java.lang.Override
public boolean needsInput() {
    if ((finishing) || ((outputIterator) != null)) {
        return false;
    }else
        if (((aggregationBuilder) != null) && (aggregationBuilder.isFull())) {
            return false;
        }else {
            return true;
        }
    
}
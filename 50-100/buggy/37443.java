@java.lang.Override
public org.fxmisc.flowless.TargetPosition transformByChange(int pos, int removedSize, int addedSize) {
    if ((itemIndex) >= (pos + removedSize)) {
        return new org.fxmisc.flowless.EndOffEnd((((itemIndex) - removedSize) + addedSize), offsetFromEnd);
    }else
        if ((itemIndex) >= pos) {
            return new org.fxmisc.flowless.EndOffEnd(((pos + addedSize) - 1), offsetFromEnd);
        }else {
            return this;
        }
    
}
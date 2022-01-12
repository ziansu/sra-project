@java.lang.Override
public bee.creative.function.Array section(final int offset, final int length) throws java.lang.IllegalArgumentException {
    final int offset2 = offset - (this.length());
    if (offset2 >= 0)
        return array.section(offset2, length);
    
    final int length2 = offset2 + length;
    if (length2 <= 0)
        return super.section(offset, length);
    
    return super.section(offset, (-offset2)).concat(array.section(0, offset2));
}
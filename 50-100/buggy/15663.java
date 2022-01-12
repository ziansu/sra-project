@java.lang.Override
public final SEG subSequence(SEG seg, int start, int end) {
    if (start < 0) {
        throw new java.lang.IllegalArgumentException(("Start cannot be negative. Start=" + start));
    }
    if (end > (length(seg))) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format("End cannot be greater than segment's length. End=%s Length=%s", end, length(seg)));
    }
    return seg == (empty) ? empty : realSubSequence(seg, start, end);
}
@java.lang.Override
public org.organicdesign.fp.collections.RrbTree.ImRrbt<E> immutable() {
    return new org.organicdesign.fp.collections.RrbTree.ImRrbt(org.organicdesign.fp.collections.RrbTree.MutableRrbt.arrayCopy(focus, focusLength, null), focusStartIndex, root, size);
}
@java.lang.Override
public edu.stanford.nlp.mt.util.Sequence<T> concat(edu.stanford.nlp.mt.util.Sequence<T> other) {
    int newSize = (size()) + (other.size());
    T[] newArr = java.util.Arrays.copyOf(elements, newSize);
    java.lang.System.arraycopy(other.elements(), 0, newArr, size(), other.size());
    return new edu.stanford.nlp.mt.util.ArraySequence<T>(true, newArr);
}
@java.lang.Override
public java.lang.CharSequence subSequence(int start, int end) {
    return new dfh.grammar.ReversedCharSequence(((zero) - start), ((zero) - end), (end - start), s, reversed);
}
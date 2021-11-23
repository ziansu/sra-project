@java.lang.Override
public void init(int begin, int end) {
    this.begin = begin;
    this.index = begin;
    this.end = (inclusive) ? end + 1 : end;
    for (int i = begin; i < (this.end); i += stride) {
        (length)++;
    }
}
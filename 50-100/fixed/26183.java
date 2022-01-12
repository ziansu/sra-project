@java.lang.Override
public int compareTo(com.jim.xiaoranlearning.ContentVO target) {
    if (((this.isKnown) == false) && ((target.isKnown) == true)) {
        return 1;
    }
    if (((this.isKnown) == true) && ((target.isKnown) == false)) {
        return -1;
    }
    return this.rawSequence.compareTo(target.rawSequence);
}
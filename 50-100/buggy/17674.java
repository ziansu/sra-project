@java.lang.Override
public int compareTo(java.lang.Object obj) {
    if (!(obj instanceof MutableInteger)) {
        return super.compareTo(obj);
    }
    if ((this.value) == (n.value())) {
        return 0;
    }
    return (this.value) > (n.value()) ? 1 : -1;
}
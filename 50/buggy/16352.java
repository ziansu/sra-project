@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (!(obj instanceof MutableInteger)) {
        return super.equals(obj);
    }
    return (this.value) == (n.value());
}
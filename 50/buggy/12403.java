@java.lang.Override
public void to(final int i) {
    if (i < 0)
        throw new java.lang.IndexOutOfBoundsException();
    
    this.c = i;
}
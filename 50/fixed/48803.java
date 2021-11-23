@java.lang.Override
public java.lang.Object getValue(int slot) {
    long val = result[slot];
    if ((val == 0) && (!(exists.get(slot)))) {
        return null;
    }else {
        return val;
    }
}
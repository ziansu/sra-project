@java.lang.Override
public void remove(int index) {
    if ((index < 0) || (index >= (accommodated))) {
        throw new java.lang.IndexOutOfBoundsException();
    }
    for (int i = index; i < ((accommodated) - 1); i++) {
        array[i] = array[(i + 1)];
    }
    (accommodated)--;
}
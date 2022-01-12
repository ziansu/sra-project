@java.lang.Override
public E remove(int arg0) {
    E temp = ((E) (data[arg0]));
    for (int i = arg0; i < ((index) - 1); i++) {
        data[i] = data[(i + 1)];
    }
    (index)--;
    return temp;
}
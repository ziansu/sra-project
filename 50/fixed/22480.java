@java.lang.Override
public void clear() {
    for (int i = 0; i < (array.length); i++)
        array[i] = null;
    
    size = 0;
}
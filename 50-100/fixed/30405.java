@java.lang.Override
public com.ankurdave.part.Leaf minimum() {
    int idx = 0;
    while ((keys[idx]) == 0)
        idx++;
    
    com.ankurdave.part.Node child = children[((to_uint(keys[idx])) - 1)];
    return com.ankurdave.part.Node.minimum(child);
}
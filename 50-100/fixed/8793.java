@java.lang.Override
public com.ankurdave.part.ChildPtr find_child(byte c) {
    for (int i = 0; i < (this.num_children); i++) {
        if ((keys[i]) == c) {
            return new com.ankurdave.part.ArrayChildPtr(children, i);
        }
    }
    return null;
}
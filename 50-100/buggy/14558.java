@java.lang.Override
public void remove_child(com.ankurdave.part.ChildPtr ref, byte c) {
    int pos = to_uint(keys[to_uint(c)]);
    com.ankurdave.part.Node.decrement_refcount(children[pos]);
    keys[to_uint(c)] = 0;
    (num_children)--;
    if ((num_children) == 12) {
        com.ankurdave.part.ArtNode16 result = new com.ankurdave.part.ArtNode16(this);
        ref.change(result);
    }
}
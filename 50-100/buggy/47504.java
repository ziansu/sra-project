@java.lang.Override
public int decrement_refcount() {
    if ((--(this.refcount)) <= 0) {
        int freed = 0;
        for (int i = 0; i < (this.num_children); i++) {
            freed += children[i].decrement_refcount();
        }
        (com.ankurdave.part.ArtNode48.count)--;
        return freed + 728;
    }
    return 0;
}
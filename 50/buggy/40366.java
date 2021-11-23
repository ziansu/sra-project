@java.lang.Override
public boolean contains(org.rascalmpl.value.IValue e) {
    for (int i = 0; i < (length()); i++) {
        if (get(0).isEqual(e)) {
            return true;
        }
    }
    return false;
}
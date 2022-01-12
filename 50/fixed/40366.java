@java.lang.Override
public boolean contains(org.rascalmpl.value.IValue e) {
    for (int i = 0; i < (length()); i++) {
        if (get(i).isEqual(e)) {
            return true;
        }
    }
    return false;
}
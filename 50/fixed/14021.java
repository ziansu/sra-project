@java.lang.Override
public boolean remove(java.lang.String element) {
    if (!(contains(element)))
        return false;
    
    removePrefix(element);
    return true;
}
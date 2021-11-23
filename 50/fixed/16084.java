@java.lang.Override
public java.lang.Object last() {
    if ((tail) == null)
        return null;
    
    return tail.value();
}
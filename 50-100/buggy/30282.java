@java.lang.Override
public boolean matches(java.util.List<T> o) {
    for (T element : o) {
        boolean matches = matcher.matches(element);
        if (matches && (!allMatch)) {
            return true;
        }else
            if ((!matches) && allMatch) {
                return false;
            }
        
    }
    return true;
}
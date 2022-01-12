@java.lang.Override
public boolean anotherPlayIsPossible() {
    java.util.List<java.lang.Integer> selected = java.util.Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8);
    if ((containspairsum11(selected)) == true) {
        return true;
    }else
        if (containsJQK(selected)) {
            return true;
        }
    
    return false;
}
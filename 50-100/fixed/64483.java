private static void printActions(java.util.List actions) {
    for (int i = 0; i < (actions.size()); i++) {
        java.lang.String action = actions.get(i).toString();
        if (i == ((actions.size()) - 1))
            java.lang.System.out.println(action);
        
    }
}
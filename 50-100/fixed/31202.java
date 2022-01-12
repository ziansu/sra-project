public void changeVariablesInList(java.util.ArrayList<resources.Expression> list, resources.Expression a, resources.Expression b) {
    java.util.ArrayList<resources.Expression> aux = new java.util.ArrayList<resources.Expression>();
    for (resources.Expression e : list) {
        aux.add(changeVariables(e, a, b));
    }
    list.clear();
    for (resources.Expression expr : aux) {
        list.add(expr.clone());
    }
}
public void changeVariablesInList(java.util.ArrayList<resources.Expression> list, resources.Expression a, resources.Expression b) {
    java.util.ArrayList<resources.Expression> aux = new java.util.ArrayList<resources.Expression>();
    for (resources.Expression e : list) {
        aux.add(changeVariables(e, a, b));
    }
    list.clear();
    java.util.Iterator<resources.Expression> ite = aux.iterator();
    while (ite.hasNext()) {
        list.add(ite.next().clone());
    } 
}
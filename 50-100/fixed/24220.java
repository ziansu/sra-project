private void markImpossibleConnections(int father, ia_practica_1_busqueda_local.Connection[] connections, int[] possible) {
    java.util.ArrayList<java.lang.Integer> children = connections[father].getFromConnections();
    int child;
    for (child = 0; child < (children.size()); child++) {
        if ((possible[child]) != (-1)) {
            possible[child] = 1;
        }
        markImpossibleConnections(child, connections, possible);
    }
}
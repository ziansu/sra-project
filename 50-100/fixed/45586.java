public void transitiveReduction() {
    for (int source = 0; source < (edges.length); source++) {
        for (int target = 0; target < (edges.length); target++) {
            if (edges[target].get(source)) {
                edges[target].andNot(edges[source]);
            }
        }
    }
}
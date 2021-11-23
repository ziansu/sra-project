public void transitiveReduction() {
    for (int source = 0; source < (size); source++) {
        for (int target = 0; target < (size); target++) {
            if (edges[source].get(target)) {
                edges[source].andNot(edges[target]);
            }
        }
    }
}
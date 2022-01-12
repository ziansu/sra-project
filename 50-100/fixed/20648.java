@java.lang.Override
public pilot.network.Edge next() {
    int j = ((i) + 1) % (locations.size());
    pilot.benders.Location loc1 = locations.get(i);
    pilot.benders.Location loc2 = locations.get(j);
    pilot.network.Edge e = new pilot.network.Edge(loc1, loc2);
    (i)++;
    return e;
}
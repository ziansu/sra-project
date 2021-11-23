@java.lang.Override
public csse230project.Edge next() {
    if (!(isSorted))
        currentCity.SortNeighbors(e);
    
    csse230project.Edge e = currentCity.neighbors.get(currentIndex);
    (currentIndex)++;
    return e;
}
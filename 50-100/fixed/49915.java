@java.lang.Override
public java.util.List<pl.edu.agh.toik.ec.algorithm.Individual> select(int selectionSize, java.util.List<pl.edu.agh.toik.ec.algorithm.Individual> population) {
    population.sort(pl.edu.agh.toik.ec.algorithm.selection.INDIVIDUAL_FITNESS_COMPARATOR);
    if ((selectionType) == (SelectionType.MAXIMUM))
        java.util.Collections.reverse(population);
    
    return new java.util.LinkedList<pl.edu.agh.toik.ec.algorithm.Individual>(population.subList(0, selectionSize));
}
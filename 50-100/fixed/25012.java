@java.lang.Override
public int compareTo(levelGenerators.jaspGeneticLevelGenerator.Individual that) {
    if ((java.lang.Math.abs(((this.fitness()) - (that.fitness())))) < (EPSILON)) {
        return 0;
    }else
        if ((this.fitness()) > (that.fitness())) {
            return 1;
        }else {
            return -1;
        }
    
}
@java.lang.Override
public java.util.List<Helper.Individuum> firstGeneration() {
    individuums = new java.util.ArrayList<Helper.Individuum>();
    generation = 1;
    for (int i = 0; i < (Exercise_3_VEGA.VEGA.NUM_INDIVIDUUM); i++) {
        individuums.add(newIndividuum());
    }
    return individuums;
}
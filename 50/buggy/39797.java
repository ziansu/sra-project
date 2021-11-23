private void sortByDate(java.util.List<model.PredictPopulation> PPList) {
    java.util.Collections.sort(PPList, (model.PredictPopulation o1,model.PredictPopulation o2) -> java.lang.Integer.compare(o1.predictYear, o2.predictYear));
}
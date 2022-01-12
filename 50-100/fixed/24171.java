@java.lang.Override
public frazer.Specimen[] selectMutants(frazer.Population population) {
    java.util.Random random = new java.util.Random();
    java.util.ArrayList<frazer.Specimen> selectedMutants = new java.util.ArrayList<>();
    frazer.Specimen[] specimens = population.getSpecimens();
    return selectedMutants.toArray(new frazer.Specimen[0]);
}
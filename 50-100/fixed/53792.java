@java.lang.Override
public void showPlant(android.univ.lille1.fr.forplants.data.Plant plant) {
    mNomPlant.setText(plant.getNom());
    mDescriptionPlant.setText(plant.getDescription());
    if ((plant.getFreq()) > 1)
        mFreqPlant.setText((("Cette plante doit être arrosée tous les " + (java.lang.String.valueOf(plant.getFreq()))) + " jours."));
    else
        mFreqPlant.setText("Cette plante doit être arrosée tous les jours.");
    
    mDateArrosage.setText(plant.getDateArrosage());
    mDateArroser.setText(plant.getDate());
}
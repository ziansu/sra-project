public void changeEntrySelection(vsd.co.za.sambugapp.DataAccess.DTO.ClassificationResultDTO currentEntry) {
    isClassified = true;
    android.widget.Toast.makeText(getApplicationContext(), "Species Identified!", Toast.LENGTH_SHORT).show();
    changeEntrySelection(((currentEntry.SpeciesID) + 1));
}
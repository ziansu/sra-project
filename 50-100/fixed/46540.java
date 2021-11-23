@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, final int position, long id) {
    android.content.Intent universityChosenIntent = new android.content.Intent(this, (isExplore ? it.unirc.barbiana20.medinav.ChooseStartingPoint.class : it.unirc.barbiana20.medinav.ChooseDestination.class));
    universityChosenIntent.putExtra("idUniversityChosen", position);
    startActivity(universityChosenIntent);
}
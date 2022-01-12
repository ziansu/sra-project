@java.lang.Override
public void onClick(android.view.View v) {
    android.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
    de.hdm.skillbee.fragments.LearningPunktFragment lpf = new de.hdm.skillbee.fragments.LearningPunktFragment();
    fragmentTransaction.replace(R.id.fragmentcontainer, lpf);
    fragmentTransaction.addToBackStack(null);
    fragmentTransaction.commit();
    lpf.setKnoten(knotenVector.elementAt(j));
}
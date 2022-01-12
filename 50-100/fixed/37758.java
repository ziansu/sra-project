@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d("medFrag.med", medicine.getMedName());
    android.app.FragmentManager fragmentManager = getFragmentManager();
    android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    example.healthassistant.MedicineFrag medFrag = new example.healthassistant.MedicineFrag();
    fragmentTransaction.replace(R.id.medFrame, medFrag);
    fragmentTransaction.commit();
}
@java.lang.Override
public void onClick(android.view.View v) {
    example.healthassistant.Medicine medicine;
    android.util.Log.d("medFrag.med", example.healthassistant.Medicine.getMedName());
    android.app.FragmentManager fragmentManager = getFragmentManager();
    android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    example.healthassistant.MedicineFrag medFrag = new example.healthassistant.MedicineFrag();
    fragmentTransaction.replace(R.id.medFrame, medFrag);
    fragmentTransaction.commit();
}
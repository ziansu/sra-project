@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.content.Intent intent = new android.content.Intent(getActivity(), com.logcat.example.pc.orbitalproj.MedicationViewer.class);
    medication = tempList.get(position);
    intent.putExtra("Medicine", medication);
    startActivity(intent);
}
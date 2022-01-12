@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if ((tempList.size()) == (position + 1)) {
        android.content.Intent intent = new android.content.Intent(getActivity(), com.logcat.example.pc.orbitalproj.MedicationEdit.class);
        startActivity(intent);
    }else {
        android.content.Intent intent = new android.content.Intent(getActivity(), com.logcat.example.pc.orbitalproj.MedicationViewer.class);
        medication = tempList.get(position);
        intent.putExtra("Medicine", medication);
        startActivity(intent);
    }
}
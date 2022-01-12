@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (streamSA[position].isEmpty())
        semesterS.setEnabled(false);
    else
        semesterS.setEnabled(true);
    
    stream = streamSA[position];
    setSemester();
}
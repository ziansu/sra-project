@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    omacka = 0;
    switch (position) {
        case 1 :
            omacka += 1;
            android.widget.Toast.makeText(this, "Boloňská omáčka", Toast.LENGTH_SHORT).show();
            break;
        case 2 :
            omacka += 2;
            android.widget.Toast.makeText(this, "Sýrová omáčka", Toast.LENGTH_SHORT).show();
            break;
    }
}
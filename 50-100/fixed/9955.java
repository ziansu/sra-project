@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    omacka = 0;
    switch (position) {
        case 0 :
            setIngedience(val);
            break;
        case 1 :
            omacka += 1;
            setIngedience(val);
            break;
        case 2 :
            omacka += 2;
            setIngedience(val);
            break;
    }
}
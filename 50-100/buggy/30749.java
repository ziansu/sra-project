@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    switch (position) {
        case 0 :
            spinner.setBackgroundColor(android.graphics.Color.rgb(255, 0, 0));
            break;
        case 1 :
            spinner.setBackgroundColor(android.graphics.Color.rgb(255, 128, 0));
            break;
        case 2 :
            spinner.setBackgroundColor(android.graphics.Color.rgb(0, 255, 0));
            break;
    }
}
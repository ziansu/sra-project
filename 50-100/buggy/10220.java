@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    switch (mPosition) {
        case 0 :
            getMenuInflater().inflate(R.menu.main, menu);
            break;
        case 1 :
            getMenuInflater().inflate(R.menu.zone, menu);
            break;
        default :
            getMenuInflater().inflate(R.menu.history, menu);
    }
    return true;
}
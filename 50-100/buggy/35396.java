@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            finish();
            return true;
        case R.id.action_add_guardia :
            addGuardiaTemporal();
            return true;
        case R.id.action_add_incidente :
            addIncidente();
        case R.id.action_bitacora :
            openBitacora();
            return true;
        case R.id.action_consigna :
            openConsigna();
            return true;
    }
    return super.onOptionsItemSelected(item);
}
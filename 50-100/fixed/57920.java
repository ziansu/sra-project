@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if ((item.getItemId()) == (R.id.action_salvar)) {
        switch (tipo_form) {
            case com.example.tabletvox03f.management.FormularioBaseActivity.FORM_INCLUIR :
                incluir();
                break;
            case com.example.tabletvox03f.management.FormularioBaseActivity.FORM_ALTERAR :
                editar();
                break;
        }
    }else
        return acaoDosEventosDoMenu(item);
    
    return false;
}
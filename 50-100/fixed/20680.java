@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    boolean deletou = false;
    if ((this.mContext) instanceof com.example.tabletvox03f.management.perfil.SelecionarPerfilActivity)
        deletou = mListener.onDeleteItem(perfil, ((this.getCount()) - 1));
    
    if (deletou) {
        removeItem(perfil);
        this.refresh();
    }
}
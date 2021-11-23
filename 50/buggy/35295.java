public java.util.ArrayList<Modelo.Usuario> listarMozosTransferencia(Modelo.Usuario mozo) {
    java.util.ArrayList<Modelo.Usuario> mozosTransferencia = this.getMozosLogueados();
    mozosTransferencia.remove(mozo);
    return mozosTransferencia;
}
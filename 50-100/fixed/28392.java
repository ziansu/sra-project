public void listar_reuniones_get() {
    org.arqrifa.viewmodels.VMListadoReuniones vm = new org.arqrifa.viewmodels.VMListadoReuniones();
    try {
        vm.setReuniones(cliente.listarReunionesPorGeneracion(usuario.getGeneracion()));
    } catch (java.lang.Exception e) {
        vm.setMensaje(e.getMessage());
    }
    mostrarVista("reuniones/listado.jsp", vm);
}
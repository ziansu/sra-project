public void serviciosPromos() {
    servicios = reservaController.obtenerReserva(nroReserva).getServicios();
    promociones = reservaController.obtenerReserva(nroReserva).getPromociones();
    if (!(servicios.isEmpty())) {
        cantServicios = reservaController.obtenerReserva(nroReserva).getCantidadServicios();
    }
}
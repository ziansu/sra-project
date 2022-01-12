public void onClick(android.content.DialogInterface dialog, int buttonId) {
    item.setIcon(R.drawable.ic_no_anotado);
    carrera.setAnotado(false);
    carrera.setTiempo(0L);
    actualizarUsuarioCarrera(carrera, EstadoCarrera.NO_ANOTADO);
}
@java.lang.Override
public void mostrarTablero(int tamaño, java.util.ArrayList<Dominio.ICasillero> casilleros) {
    Vistas.PanelTablero p = new Vistas.PanelTablero(controlador, jugador);
    p.mostrar(tamaño, casilleros);
    split.setBottomComponent(p);
    validate();
    split.setDividerLocation(200);
}
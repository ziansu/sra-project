void _descombinar() {
    fiuba.algo3.algoformers.algoformers.AlgoFormer superion = equipo.get(0);
    fiuba.algo3.algoformers.escenario.Tablero tablero = fiuba.algo3.algoformers.escenario.Tablero.getInstance();
    tablero.borrarAlgoformer(superion);
    equipo = superion.devolverIntegrantes();
    java.util.List<fiuba.algo3.algoformers.escenario.Posicion> posicionesDisponibles = tablero.movimientosValidos(superion);
    int posicion = 0;
    for (fiuba.algo3.algoformers.algoformers.AlgoFormer algoformer : equipo) {
        tablero.colocarAlgoformer(algoformer, posicionesDisponibles.get(posicion));
        posicion++;
    }
    combinado = false;
}
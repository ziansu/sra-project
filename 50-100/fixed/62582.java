public void RecorrerCamino(Dungeon.Celda posicion_meta) {
    Dungeon.Celda celda_camino = posicion_meta;
    distancia = 0;
    while ((celda_camino.inicio) == false) {
        Dungeon.Celda celda_precursora = dungeon[celda_camino.Posicion_precursor[0]][celda_camino.Posicion_precursor[1]];
        if (celda_camino == celda_precursora) {
            distancia = -1;
            break;
        }else {
            celda_camino = celda_precursora;
            (distancia)++;
        }
    } 
}
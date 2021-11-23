public void borrarTablero() {
    bd.Update((("UPDATE Jugadores SET Tablero=NULL WHERE NombreUsuario='" + (nombreUsuario)) + "'"));
    int id = tablero.obtIdSudoku();
    bd.Update((((("INSERT INTO Ranking (NombreUsuario, IdSudoku, Puntuaci�n) VALUES ('" + (nombreUsuario)) + "',") + id) + ",0)"));
}
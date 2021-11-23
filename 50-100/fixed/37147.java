static double ABcrossAC(Main.Coordinate A, Main.Coordinate B, Main.Coordinate C) {
    return (((B.x) - (A.x)) * ((C.y) - (A.y))) - (((B.y) - (A.y)) * ((C.x) - (A.x)));
}
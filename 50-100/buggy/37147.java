static double ABcrossAC(Main.Coordinate A, Main.Coordinate B, Main.Coordinate C) {
    return (((B.x) - (A.x)) * ((C.x) - (A.x))) - (((B.y) - (A.y)) * ((C.y) - (A.y)));
}
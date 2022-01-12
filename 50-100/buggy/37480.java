public static double dist(com.example.ilnarsabirzyanov.areena.game.Point a, com.example.ilnarsabirzyanov.areena.game.Point b, com.example.ilnarsabirzyanov.areena.game.Point c) {
    com.example.ilnarsabirzyanov.areena.game.Point abV = b.sub(a);
    com.example.ilnarsabirzyanov.areena.game.Point acV = c.sub(a);
    double angle = 1 - (abV.cos2(acV));
    return java.lang.Math.sqrt((angle * (acV.mod2())));
}
public static Algebra.Polynome BasicBinome(java.lang.String var, java.lang.Integer root) {
    Algebra.Polynome basicBinome = new Algebra.Polynome();
    basicBinome.members.add(new Algebra.PolynomeMember(var, 1, 1));
    basicBinome.members.add(new Algebra.PolynomeMember(new Algebra.MathFunction(), 0, root));
    return basicBinome;
}
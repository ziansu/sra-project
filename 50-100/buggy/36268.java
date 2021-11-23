public static jeranvier.math.linearAlgebra.Vector topHat(jeranvier.math.linearAlgebra.Vector f, jeranvier.math.morphology.StructuringElement g) {
    return new jeranvier.math.linearAlgebra.Vector(f.getRange(((2 * (g.getCenterIndex())) + 1), ((f.size()) - (2 * ((g.size()) - (g.getCenterIndex()))))).substract(jeranvier.math.morphology.MMOperations.open(f, g)).data());
}
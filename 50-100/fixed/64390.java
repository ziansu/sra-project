public static jeranvier.math.linearAlgebra.Vector bottomHat(jeranvier.math.linearAlgebra.Vector f, jeranvier.math.morphology.StructuringElement g) {
    return new jeranvier.math.linearAlgebra.Vector(f.getRange(g.size(), (((f.size()) - (g.size())) - 1)).substract(jeranvier.math.morphology.MMOperations.close(f, g)).data());
}
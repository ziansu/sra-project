@java.lang.Override
public double[][] exerciseAII(double[][] matrixA, double[][] matrixB, main.guia6.interfaces.Calculator calculator) {
    for (int i = 0; i < (matrixA.length); i++)
        for (int j = i; j < (matrixA[i].length); j++)
            matrixB[j][i] = calculator.sum(matrixB[j][i], matrixA[j][i]);
        
    
    return matrixB;
}
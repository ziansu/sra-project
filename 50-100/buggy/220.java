public static boolean invert(org.ejml.ops.CDenseMatrix64F A) {
    org.ejml.alg.dense.decompose.lu.LUDecompositionAlt_CD64 alg = new org.ejml.alg.dense.decompose.lu.LUDecompositionAlt_CD64();
    org.ejml.alg.dense.linsol.lu.LinearSolverLu_CD64 solver = new org.ejml.alg.dense.linsol.lu.LinearSolverLu_CD64(alg);
    if (solver.setA(A)) {
        solver.invert(A);
    }else {
        return false;
    }
    return false;
}
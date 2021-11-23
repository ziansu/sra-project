private org.apache.commons.math3.linear.RealMatrix calculateCovariateMatrix(final org.knime.base.node.mine.regression.logistic.learner4.sag.WeightVector<T> beta) {
    final double[][] hessian = m_loss.hessian(m_data, beta);
    org.apache.commons.math3.linear.RealMatrix observedInformation = org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(hessian);
    return org.apache.commons.math3.linear.MatrixUtils.inverse(observedInformation).scalarMultiply((-1));
}
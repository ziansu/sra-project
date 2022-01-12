@java.lang.Override
public org.nd4j.linalg.api.ndarray.INDArray setGradientFor(java.lang.String variable, org.nd4j.linalg.api.ndarray.INDArray gradient, java.lang.Character flatteningOrder) {
    org.nd4j.linalg.api.ndarray.INDArray last = setGradientFor(variable, gradient);
    if (flatteningOrder != null) {
        if ((flatteningOrders) == null)
            flatteningOrders = new java.util.LinkedHashMap<>();
        
        flatteningOrders.put(variable, flatteningOrder);
    }
    return last;
}
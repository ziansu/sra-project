@java.lang.Override
public edu.neu.ccs.pyramid.dataset.MultiLabel predict(java.util.Vector vector) {
    edu.neu.ccs.pyramid.dataset.MultiLabel pred = null;
    switch (predictionMode) {
        case "support" :
            pred = predictBySupport(vector);
            break;
        case "sampling" :
            pred = predictBySampling(vector);
            break;
        default :
            throw new java.lang.IllegalArgumentException("unknown mode");
    }
    return pred;
}
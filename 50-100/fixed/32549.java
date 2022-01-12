protected void sgd(edu.cmu.ml.proppr.util.ParamVector params, edu.cmu.ml.proppr.learn.SRW.SgdExample ex) {
    gnu.trove.map.TIntDoubleMap gradient = gradient(params, ex);
    for (gnu.trove.iterator.TIntDoubleIterator grad = gradient.iterator(); grad.hasNext();) {
        grad.advance();
        java.lang.String feature = ex.g.featureLibrary.getSymbol(grad.key());
        if (trainable(feature))
            params.adjustValue(feature, ((-(learningRate())) * (grad.value())));
        
    }
}
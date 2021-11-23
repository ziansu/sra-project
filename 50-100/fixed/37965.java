@java.lang.Override
public se.sics.anomaly.bs.core.AnomalyResult calculateAnomaly(org.apache.flink.api.java.tuple.Tuple4<java.lang.Double, java.lang.Double, java.lang.Long, java.lang.Long> v) {
    se.sics.anomaly.bs.models.poisson.PoissonHValue h = ((se.sics.anomaly.bs.models.poisson.PoissonHValue) (hist.getHistory()));
    if (h == null) {
        return new se.sics.anomaly.bs.core.AnomalyResult((-1), v.f2, v.f3);
    }
    return new se.sics.anomaly.bs.core.AnomalyResult(se.sics.anomaly.bs.models.poisson.PoissonModel.calculateAnomaly(v.f0, v.f1, h.f0, h.f1), v.f2, v.f3);
}
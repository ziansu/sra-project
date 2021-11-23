@java.lang.Override
public double distortion() {
    double rv = 0.0;
    for (pt.it.av.atnog.ml.clustering.Element e : this)
        rv += java.lang.Math.pow(medoid.distance(e), 2.0);
    
    return rv;
}
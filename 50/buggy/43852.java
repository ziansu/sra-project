public org.ramonaza.officialramonapp.people.rides.backend.RidesOptimizer setAlgorithm(int algorithm, boolean retainPreexisting) {
    this.algorithm = algorithm;
    this.retainPreexisting = retainPreexisting;
    android.util.Log.d("Opt", ("Algorithm Set: " + algorithm));
    return this;
}
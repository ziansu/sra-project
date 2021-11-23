void cluster() {
    java.lang.System.out.println(("eps: " + (this.view.eps.doubleValue())));
    java.lang.System.out.println(("minPts: " + (this.view.minPts.get())));
    this.clustering = spinacht.subclu.DumbSUBCLU.go(new spinacht.common.Params(this.view.eps.doubleValue(), this.minPts.get(), this.db));
}
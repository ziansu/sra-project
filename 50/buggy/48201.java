@java.lang.Override
public void setup(org.cs4j.core.SearchDomain domain, double epsilon, double delta) {
    super.setup(domain, epsilon, delta);
    this.probNotSuboptimal = 1;
    this.hToCdf = this.createCDFs();
}
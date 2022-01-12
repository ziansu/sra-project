@java.lang.Override
public void setup(org.cs4j.core.SearchDomain domain, double epsilon, double delta) {
    this.probNotSuboptimal = 1;
    super.setup(domain, epsilon, delta);
}
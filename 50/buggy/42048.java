public org.springframework.ide.eclipse.boot.dash.cloudfoundry.client.v2.CFRouteBuilder domain(java.lang.String domain) {
    this.domain = domain;
    this.fullRoute = buildRouteVal(this.host, this.domain, this.path, this.port);
    return this;
}
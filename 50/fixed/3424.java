public org.springframework.ide.eclipse.boot.dash.cloudfoundry.client.v2.CFRouteBuilder path(java.lang.String path) {
    this.path = path;
    this.fullRoute = org.springframework.ide.eclipse.boot.dash.cloudfoundry.client.v2.CFRouteBuilder.buildRouteVal(this.host, this.domain, this.path, this.port);
    return this;
}
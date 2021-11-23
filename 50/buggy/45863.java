public prj.jolokiaweb.JolokiaApp build() throws javax.servlet.ServletException {
    return new prj.jolokiaweb.JolokiaApp(this.jolokiaUrl, this.port);
}
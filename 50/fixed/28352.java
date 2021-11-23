@myapp.routes.GET
@myapp.routes.Path(value = "/")
@myapp.routes.Produces(value = Mimes.HTML)
public rocker.RockerTemplate render() {
    return new myapp.routes.RockerTemplate().setTemplateName("views/index.rocker.html").setObjects("Current time in millis is");
}
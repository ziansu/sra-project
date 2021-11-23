@java.lang.Override
public void start() {
    this.stored = new java.util.HashMap<java.lang.Integer, direction_api.common.structures.QueryResults>();
    if (direction_api.common.Constants.debugging) {
        java.lang.System.out.println(("Reducer> configuration_file: " + (this.configuration.getPath())));
        java.lang.System.out.println(("Reducer> server_port: " + (this.port)));
        java.lang.System.out.println("Reducer> start()");
    }
    super.start();
}
public static void main(java.lang.String[] args) {
    fr.jgetmove.jgetmove.debug.Debug.enable();
    try {
        fr.jgetmove.jgetmove.io.Input inputObj = new fr.jgetmove.jgetmove.io.Input("assets/test.dat");
        fr.jgetmove.jgetmove.io.Input inputTime = new fr.jgetmove.jgetmove.io.Input("assets/testtimeindex.dat");
        fr.jgetmove.jgetmove.database.Database database = new fr.jgetmove.jgetmove.database.Database(inputObj, inputTime);
        fr.jgetmove.jgetmove.debug.Debug.println(database);
        fr.jgetmove.jgetmove.solver.Solver solver = new fr.jgetmove.jgetmove.solver.Solver(1, 0, 0);
        solver.init(database);
    } catch (java.io.IOException | fr.jgetmove.jgetmove.exception.ClusterNotExistException e) {
        e.printStackTrace();
    }
}
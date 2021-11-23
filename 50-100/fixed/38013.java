@java.lang.Override
public java.util.List<data_structures.treasure.Treasure> getAllTreasures() {
    java.util.concurrent.Future<java.util.List<data_structures.treasure.Treasure>> future = core.CoreModel.getInstance().addCommand(new frontend.Requests.GetAllTreasuresCommand(true));
    try {
        return future.get();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
        java.lang.System.err.println(e);
    } catch (java.util.concurrent.ExecutionException e) {
        e.printStackTrace();
        java.lang.System.err.println(e);
    }
    return null;
}
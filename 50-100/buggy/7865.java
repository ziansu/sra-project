@java.lang.Override
public java.lang.Boolean eventTreasureOpened(java.lang.Integer token, java.lang.Integer treasureID, java.lang.Integer userID) {
    assert isTokenActive(token);
    java.util.concurrent.Future<java.lang.Boolean> future = core.CoreModel.getInstance().addCommand(new frontend.Requests.OpenTreasureCommand(treasureID, userID));
    try {
        return future.get();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    } catch (java.util.concurrent.ExecutionException e) {
        e.printStackTrace();
    }
    return false;
}
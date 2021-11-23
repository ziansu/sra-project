@java.lang.Override
public data_structures.user.HighscoreList getHighscoreList(java.lang.Integer token, java.lang.Integer low, java.lang.Integer high) {
    assert isTokenActive(token);
    try {
        return core.CoreModel.getInstance().addCommand(new frontend.Requests.GetHighscoresAroundCommand(token, low, high)).get();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    } catch (java.util.concurrent.ExecutionException e) {
        e.printStackTrace();
    }
    return null;
}
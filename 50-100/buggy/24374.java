@java.lang.Override
public data_structures.user.User getUserByName(java.lang.String username) {
    try {
        java.lang.System.err.println(("Method getuserbyname: " + username));
        return core.CoreModel.getInstance().addCommand(new frontend.Requests.GetUserByNameCommand(username)).get();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    } catch (java.util.concurrent.ExecutionException e) {
        e.printStackTrace();
    }
    return null;
}
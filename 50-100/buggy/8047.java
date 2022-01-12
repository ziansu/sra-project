public static boolean cancel(int index) {
    if ((index == (-1)) || ((co.theengine.loomdemo.LoomHTTP.clients[index]) == null)) {
        return false;
    }
    co.theengine.loomdemo.LoomHTTP.clients[index].cancelRequests(co.theengine.loomdemo.LoomHTTP._context, true);
    co.theengine.loomdemo.LoomHTTP.removeClient(index);
    return true;
}
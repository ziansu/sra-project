@java.lang.Override
public void run() {
    if ((usersList.size()) > 0) {
        usersList.remove(((usersList.size()) - 1));
        validateRateLimit(searchView.getQuery().toString(), 1);
    }
}
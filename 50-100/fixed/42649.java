private boolean removeFromDatabase(java.lang.String line) {
    _logger.log(java.util.logging.Level.INFO, ("Removing: " + line));
    boolean removed = false;
    int x = 0;
    while ((!removed) && (x < (_tasks.size()))) {
        java.lang.String str = _tasks.get(x);
        if (str.equals(line)) {
            removed = true;
            _tasks.remove(x);
            break;
        }
        x++;
    } 
    return removed;
}
public char get_action(char[][] view) {
    char action;
    try {
        java.lang.Thread.sleep(10);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    map.update(view, ori, getPosition());
    map.print();
    action = guide.next();
    updateState(action);
    return action;
}
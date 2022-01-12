private void goToLastChild() {
    java.util.ArrayList<com.yayitsandrew.hivemind.ThoughtNode> children = _curr.children;
    if ((children.size()) == 0) {
        if (!(getCurrentThought().equals(""))) {
            growChild();
        }
        return ;
    }
    if ((_curr.lastVisitedChild) != null) {
        _curr = _curr.lastVisitedChild;
    }else {
        _curr = children.get(0);
    }
}
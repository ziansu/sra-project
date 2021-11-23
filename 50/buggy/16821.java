@java.lang.Override
public solution.Move notify(int location, java.util.List<solution.Move> list) {
    this.choicemove = player.notify(location, list);
    if ((choicemove) != null)
        return choicemove;
    else {
        return null;
    }
}
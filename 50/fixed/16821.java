@java.lang.Override
public solution.Move notify(int location, java.util.List<solution.Move> list) {
    if ((player) != null) {
        this.choicemove = player.notify(location, list);
    }else
        choicemove = null;
    
    return choicemove;
}
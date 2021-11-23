private void sendInput(int index) {
    if ((following) == null)
        return ;
    
    for (Games.Controllers.ObserveBoardInput listener : following) {
        listener.update(index);
        java.lang.System.out.println(("update" + index));
    }
}
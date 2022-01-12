private void sendInput(int index) {
    if ((following) == null)
        return ;
    
    for (Games.Controllers.ObserveBoardInput listener : following) {
        listener.update(index);
    }
}
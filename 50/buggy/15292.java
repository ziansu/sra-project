@java.lang.Override
public void act(java.lang.String target, java.lang.String message) {
    if (dispose)
        return ;
    
    inst.act(target, nick);
}
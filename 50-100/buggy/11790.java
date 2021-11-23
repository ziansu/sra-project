@java.lang.Override
public void update() {
    super.update();
    if (world().isRemote)
        return ;
    
    if (tick(0))
        processInputs();
    
    if (tick(1))
        processAspects();
    
    if (tick(2))
        processStorage();
    
}
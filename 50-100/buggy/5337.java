@java.lang.Override
public void run() {
    if (!(initialized)) {
        advertiseSelf("SPAWN");
        initialized = true;
    }
    chooseTarget();
    if (needs_move())
        step();
    else
        if ((target_food) != null)
            eat();
        else
            resetState();
        
    
}
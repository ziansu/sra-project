@java.lang.Override
public void execute(com.ivstuart.tmud.state.Mob mob_, java.lang.String input_) {
    super.execute(mob_, input_);
    int numberOfLevels = 1;
    if ((input_.length()) > 0) {
        numberOfLevels = java.lang.Integer.parseInt(input_);
    }
    while ((numberOfLevels--) > 0) {
        int xp = mob_.getPlayer().getData().getToLevelXp();
        mob_.getPlayer().getData().addXp(xp);
        mob_.getPlayer().checkIfLeveled();
    } 
}
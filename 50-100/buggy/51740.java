@java.lang.Override
public java.lang.String toString() {
    int depth = 0;
    edu.umn.kylepete.player.UCTPlayer.StateNode temp = this.parent;
    while (temp != null) {
        depth++;
        temp = temp.parent;
    } 
    return ((((((("Depth(" + depth) + "), Reward(") + (totalReward)) + "), Visits(") + (visits)) + ") Children(") + (children.size())) + ")";
}
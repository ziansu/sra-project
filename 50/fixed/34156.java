public java.lang.Boolean leavePlot(org.bukkit.entity.Player player) {
    if ((state) == (BuildOffState.OPENED)) {
        java.lang.Boolean result = resetPlot(player, true);
        board.update();
        return result;
    }
    return null;
}
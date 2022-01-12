private void swapStones(controller.Connection conn, java.util.List<controller.Move> moves, int amount) {
    java.util.List<controller.Block> blocks = stack.give(amount);
    conn.getPlayer().swapHand(moves, blocks);
    java.lang.String blockString = "";
    for (controller.Block block : blocks) {
        blockString = blockString.concat((" " + (block.toString())));
    }
    sendMessage(conn, ("NEW" + blockString));
}
public static double calBeetleScore(client.Beetle beetle, client.Move move) {
    client.Cell[] oppCells = client.AI.game.getMap().getOppCells();
    double ans = 0;
    for (client.Cell c : oppCells) {
        client.Beetle b = ((client.Beetle) (c.getBeetle()));
        ans += client.AI.calScore(beetle, move, b);
    }
    ans /= oppCells.length;
    return ans;
}
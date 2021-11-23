private com.gamesbykevin.breakout.ball.Balls.Key getRandomKey() {
    if (this.keys.isEmpty()) {
        for (com.gamesbykevin.breakout.ball.Balls.Key key : com.gamesbykevin.breakout.ball.Balls.Key.values()) {
            if (key == (com.gamesbykevin.breakout.ball.Balls.Key.Red))
                continue;
            
            this.keys.add(key);
        }
    }
    final int index = GamePanel.RANDOM.nextInt(com.gamesbykevin.breakout.ball.Balls.Key.values().length);
    final com.gamesbykevin.breakout.ball.Balls.Key tmp = com.gamesbykevin.breakout.ball.Balls.Key.values()[index];
    this.keys.remove(index);
    return tmp;
}
private com.gamesbykevin.breakout.ball.Balls.Key getRandomKey() {
    if (this.keys.isEmpty()) {
        for (com.gamesbykevin.breakout.ball.Balls.Key key : com.gamesbykevin.breakout.ball.Balls.Key.values()) {
            if (key == (com.gamesbykevin.breakout.ball.Balls.Key.Red))
                continue;
            
            this.keys.add(key);
        }
    }
    final int index = GamePanel.RANDOM.nextInt(this.keys.size());
    final com.gamesbykevin.breakout.ball.Balls.Key tmp = this.keys.get(index);
    this.keys.remove(index);
    return tmp;
}
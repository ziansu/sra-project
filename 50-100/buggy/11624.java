private void catchTheGift() {
    if (gift.getRect().intersects(paddle.getRect())) {
        gift = null;
        for (brickbreaker.source.Ball ball : balls) {
            if ((ball.getSpeed()) >= 3) {
                ball.setSpeed(brickbreaker.source.BALL_SPEED);
                ball.setImage(brickbreaker.source.BALL);
            }else
                if ((paddle.width) <= 50) {
                    Sound.SIZEUP.play();
                    paddle.setWidth(75);
                }else {
                    score += 10;
                }
            
        }
    }
}
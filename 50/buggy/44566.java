private boolean canPurchase(com.app.game.quizee.backend.GameItem gameItem) {
    return (this.points) >= (gameItem.getPrice());
}
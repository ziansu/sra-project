public void newGame() {
    controller.Observer.trigger("resetGame", new controller.SubscriberDaten());
    this.primaryStage.setScene(this.getStartScene());
}
public boolean rabbitOn(com.ZamanGames.RabbitGame.gameobjects.Rabbit rabbit) {
    return (((rabbit.getX()) + ((rabbit.getWidth()) - 10)) >= (getX())) && (((rabbit.getX()) + ((rabbit.getWidth()) / 2)) < ((getX()) + (getWidth())));
}
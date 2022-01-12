private void exchangeAbility(com.boardgame.friday.cards.RobinsonCard clicked, int request) {
    clicked.flagCannotSelect();
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.boardgame.friday.abilities.ExchangeActivity.class);
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putSerializable(ExchangeActivity.PLAYER_HAND, player.getHand());
    if (request == (com.boardgame.friday.GameActivity.EXCHANGE_ONE_CARD_REQUEST)) {
        bundle.putSerializable(ExchangeActivity.SECOND_EXCHANGE, false);
    }else {
        bundle.putSerializable(ExchangeActivity.SECOND_EXCHANGE, true);
    }
    intent.putExtras(bundle);
    startActivityForResult(intent, request);
}
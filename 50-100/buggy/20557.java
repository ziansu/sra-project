private ua.storchak.task.blackjack.service.blackjack.response.common.GameResponse finishGameAtDealPhase() {
    if (currentGameData.checkPush()) {
        return createEndGameResponse(GameAnswerType.PUSH);
    }
    if (currentGameData.checkDealerBlackJack()) {
        accountDao.subtractPlayersBet(payDataHolder.getPayData());
        return createEndGameResponse(GameAnswerType.LOST);
    }else {
        accountDao.addHalfPlayersBet(payDataHolder.getPayData());
        return createEndGameResponse(GameAnswerType.BLACKJACK);
    }
}
public com.alibaba.game.texasholdem.ranking.RankingResult getRankingResult() {
    if ((rankingResult) == null) {
        rankingResult.setRankingEnum(RankingEnum.HIGH_CARD);
        rankingResult.setHighCard(this.cards.get(0));
    }
    return rankingResult;
}
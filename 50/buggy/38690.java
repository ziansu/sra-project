@java.lang.Override
public league.entities.SummonerDto searchSummoner(java.lang.String summonerName) throws league.api.RiotAPIImpl.RiotPlsException {
    league.entities.SummonerDto result = dbApi.searchSummoner(summonerName);
    return result == null ? riotApi.searchSummoner(summonerName) : result;
}
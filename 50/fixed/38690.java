@java.lang.Override
public league.entities.SummonerDto searchSummoner(java.lang.String summonerName) throws league.api.RiotAPIImpl.RiotPlsException {
    league.entities.SummonerDto result = riotApi.searchSummoner(summonerName);
    return result == null ? dbApi.searchSummoner(summonerName) : result;
}
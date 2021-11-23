@com.backend.match.RequestMapping(value = "/match/{matchID}", method = RequestMethod.DELETE)
public com.backend.match.Match removeMatch(@com.backend.match.PathVariable
java.lang.String matchID) {
    return matchController.deleteMatch(matchID);
}
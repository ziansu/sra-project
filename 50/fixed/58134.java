@com.backend.match.RequestMapping(value = "/match/{matchID}", method = RequestMethod.DELETE)
public void removeMatch(@com.backend.match.PathVariable
java.lang.String matchID) {
    matchController.deleteMatch(matchID);
}
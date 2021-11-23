@java.lang.Override
public de.bensoft.acis.core.MatchResult onGetBestResult(de.bensoft.acis.core.MatchResult[] results) {
    if ((results.length) == 0)
        currentResponse = (((STANDARD_RESPONSE) + "<response version=\"") + (de.bensoft.acis.core.ACIS.LIBRARY_VERSION)) + "\"><type>NO_RESULTS</type></response>";
    
    de.bensoft.acis.core.MatchResult matchResult = super.onGetBestResult(results);
    matchScore = matchResult.getScore();
    return matchResult;
}
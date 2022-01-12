@com.collegeboard.assessment.guesser.spring.RequestMapping(value = "", method = RequestMethod.POST)
public java.lang.String startGame(@com.collegeboard.assessment.guesser.spring.RequestParam
int bound, @com.collegeboard.assessment.guesser.spring.RequestParam
int bound2) {
    org.json.JSONObject jsonObject = new org.json.JSONObject();
    try {
        guesser = new com.collegeboard.assessment.guesser.Guesser(bound, bound2);
    } catch (java.lang.IllegalArgumentException e) {
        jsonObject.put("exception", e);
    }
    int guess = guesser.guess("");
    jsonObject.put("response", guess);
    return jsonObject.toString();
}
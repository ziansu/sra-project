protected boolean isCorrectResponse(java.lang.String nonce, java.lang.String challengeResponse) {
    if (nonceToCorrectResponsesMap.containsKey(nonce)) {
        java.lang.String correctResponse = nonceToCorrectResponsesMap.get(nonce);
        java.lang.String correctChallengeResponse = createChallengeResponse(nonce, correctResponse);
        return challengeResponse.equals(correctChallengeResponse);
    }
    return false;
}
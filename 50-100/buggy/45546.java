protected com.recruitment.json.model.CandidateResponse getCandidates(com.recruitment.json.model.Test t) {
    java.lang.String jsonData = readFromFile(getTestCandidateFileName(t));
    com.fasterxml.jackson.databind.ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
    try {
        com.recruitment.json.model.CandidateResponse candidateResponse = objectMapper.readValue(jsonData, com.recruitment.json.model.CandidateResponse.class);
        return candidateResponse;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return new com.recruitment.json.model.CandidateResponse();
    }
}
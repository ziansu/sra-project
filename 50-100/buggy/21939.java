public static com.pasapalabra.game.model.DTO.QuestionDTO getQuestion() throws java.lang.Exception {
    try {
        com.pasapalabra.game.model.DTO.QuestionDTO question = ServiceLocator.service.getQuestion(com.pasapalabra.game.service.ClientConnection.sessionAuth);
        if (question == null)
            if ((question.getLeter()) == 'z')
                com.pasapalabra.game.service.ClientConnection.reachZ = true;
            
        
        return question;
    } catch (java.lang.Exception e) {
        throw e;
    }
}
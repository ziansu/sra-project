public model.DTO.QuestionDTO play(service.auth.Token session, model.QuestionType type) {
    if (service.auth.SessionManager.isValidSession(session)) {
        java.util.ArrayList<model.Question> questions = null;
        service.PasapalabraService.currentQuestions.put(session, questions);
        service.PasapalabraService.currentResult.put(session, new model.UserScore());
        return model.assembler.QuestionAssembler.getInstance().assembleToDTO(questions.get(0));
    }else {
        return null;
    }
}
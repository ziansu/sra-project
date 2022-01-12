@java.lang.Override
public ru.hh.resumebuilderbot.question.generator.QuestionGeneratorsQueue handle(ru.hh.resumebuilderbot.ChatId chatId, ru.hh.resumebuilderbot.Answer answer) {
    if (ru.hh.resumebuilderbot.question.storage.QuestionsStorage.finished(chatId)) {
        questionGeneratorsQueue.add(new ru.hh.resumebuilderbot.question.generator.FixedQuestionGenerator(ru.hh.resumebuilderbot.texts.storage.TextId.FINISHED));
        return questionGeneratorsQueue;
    }
    ru.hh.resumebuilderbot.user.data.storage.UserDataStorage.registerAnswer(chatId, answer);
    if (ru.hh.resumebuilderbot.question.storage.QuestionsStorage.finished(chatId)) {
        questionGeneratorsQueue.add(new ru.hh.resumebuilderbot.question.generator.FixedQuestionGenerator(ru.hh.resumebuilderbot.texts.storage.TextId.FINISHED));
        return questionGeneratorsQueue;
    }
    questionGeneratorsQueue.add(new ru.hh.resumebuilderbot.question.generator.NextQuestionGenerator(chatId));
    return questionGeneratorsQueue;
}
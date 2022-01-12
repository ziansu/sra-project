public com.studylist.model.Question buildQuestion(com.studylist.model.StudyList originalList) {
    if ((originalList.getList().size()) > 1) {
        final int randomIndex = randomGenerator.nextInt(((originalList.getList().size()) - 1));
        return new com.studylist.model.Question(originalList, originalList.getListTitle(), randomIndex, originalList.getAnswer());
    }
    return new com.studylist.model.Question(originalList, originalList.getListTitle(), 0, originalList.getAnswer());
}
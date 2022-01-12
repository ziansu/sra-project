private com.studylist.model.StudyList getRandomStudyList(java.util.List<com.studylist.model.StudyList> studyList) {
    if ((studyList.size()) < 1) {
        final int randomListIndex = randomGenerator.nextInt(((studyList.size()) - 1));
        return studyList.get(randomListIndex);
    }
    return studyList.get(0);
}
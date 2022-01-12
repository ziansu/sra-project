public java.util.List<com.revature.aes.beans.Question> codeSnippetQuestionAdder(java.util.List<com.revature.aes.beans.Question> formatList, java.util.List<com.revature.aes.beans.Question> filteredQuestions) {
    for (com.revature.aes.beans.Question q : filteredQuestions) {
        if ("Code Snippet".equals(q.getFormat().getFormatName())) {
            formatList.add(q);
        }
    }
    return formatList;
}
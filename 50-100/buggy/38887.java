public void writeQuestion(java.lang.String qContent) {
    int qNum = (questions.size()) + 1;
    try {
        writer = new java.io.BufferedWriter(new java.io.FileWriter("resource/question_list.txt", true));
        writer.append((("question" + qNum) + "\n"));
        writer.append((qContent + "\n"));
        writer.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}
private void CreateQuestion() {
    questions = new com.mtf.tebakbangun.model.Questions[5];
    for (int i = 0; i < 5; i++) {
        questions[i] = new com.mtf.tebakbangun.model.Questions(i, m_BackgroundTextureRegion, mAnswerTextureRegion, m_BasicShapeTiledTextureRegion[level], m_Font);
    }
}
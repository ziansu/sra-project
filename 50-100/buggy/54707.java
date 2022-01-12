private void CreateQuestion(int level) {
    try {
        questions = new com.mtf.tebakbangun.model.Questions[5];
        for (int i = 0; i < 5; i++) {
            questions[i] = new com.mtf.tebakbangun.model.Questions(m_BackgroundTextureRegion, mAnswerTextureRegion, m_BasicShapeTiledTextureRegion[level], m_Font);
        }
        m_mainScene.registerTouchArea(questions[level]);
        m_mainScene.attachChild(questions[level]);
    } catch (java.lang.Exception x) {
        android.util.Log.d("Ocsa", ("ERROR: Level = " + (this.level)));
    }
}
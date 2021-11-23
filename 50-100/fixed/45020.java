public int getSurveyPosition(long surveyId) {
    int pos = 0;
    if (surveyId != 0) {
        for (int i = 0; i < (surveys.size()); i++) {
            if ((surveys.get(i).getId()) == surveyId) {
                pos = i + 1;
                break;
            }
        }
    }
    return pos;
}
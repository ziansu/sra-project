private double wrongAnswerImageRatio() {
    if ((maxNumberOfWrongAnswers()) == 0) {
        return 1;
    }else {
        return (imageResolution) / (maxNumberOfWrongAnswers());
    }
}
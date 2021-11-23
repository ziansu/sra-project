public void unpause() {
    timer.setPaused(false);
    questionLabel.setText(currentQuestion.getQuestion());
    a.setVisible(true);
    b.setVisible(true);
    c.setVisible(true);
    if (!(atQuestionStage))
        d.setVisible(true);
    
    repaint();
    revalidate();
}
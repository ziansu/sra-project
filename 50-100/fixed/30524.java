public void changeState(int state) {
    switch (state) {
        case 0 :
            if (this.Questionnaires.lastElement().isFinalized()) {
                this.Questionnaires.add(new Questionnaire());
            }
            new TaskSettings(this);
            break;
        case 1 :
            new MainGUI(this);
            break;
        case 2 :
            new Comparisons(this);
            break;
        case 3 :
            new Evaluation(this);
            break;
        default :
    }
}
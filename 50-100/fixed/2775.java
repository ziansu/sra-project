public void actionPerformed(java.awt.event.ActionEvent e) {
    rebus.pickSolutionWord();
    if (Config.LANGUAGE.equals("En")) {
        solutionWordTextFieldAdmin.setText(Config.solutionBigWord.getEnglish());
    }else {
        solutionWordTextFieldAdmin.setText(Config.solutionBigWord.getTelugu());
    }
}
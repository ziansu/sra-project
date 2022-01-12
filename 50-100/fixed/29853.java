public void createGUI() {
    ActivityCard welcomeCard = new ActivityCard(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER));
    welcomeCard.add(new javax.swing.JLabel("<html><h1>Welcome to ETApplet</h1></html>"));
    ETApplet.addCard(welcomeCard, "welcome");
    AssessmentCard assessmentCard = new AssessmentCard();
    ETApplet.addCard(assessmentCard, "assessment");
    this.getContentPane().add(ETApplet.cardpanel);
    this.validate();
    ETApplet.switchToCard("assessment");
}
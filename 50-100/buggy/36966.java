@java.lang.Override
public void display(com.vaadin.ui.HorizontalLayout layoutH) {
    layoutH.addComponent(new com.vaadin.ui.Label(timer));
    layoutH.addComponent(new com.vaadin.ui.Label(question));
    layoutH.addComponent(new com.vaadin.ui.Label(answer1));
    layoutH.addComponent(new com.vaadin.ui.Label(answer2));
    for (com.decideme.definitions.MultiVoteAnswerDefinition answer : answers) {
        com.vaadin.ui.HorizontalLayout addAnswer = new com.vaadin.ui.HorizontalLayout();
        layoutH.addComponent(addAnswer);
        answer.display(addAnswer);
    }
}
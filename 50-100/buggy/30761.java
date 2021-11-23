@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    io.github.algorys.agshmne.events.quest.IQuest selectedQuest = quests.getModel().getElementAt(index);
    io.github.algorys.agshmne.game.quest.JQuestResume questDialog = new io.github.algorys.agshmne.game.quest.JQuestResume(topFrame, selectedQuest, pj);
    questDialog.setVisible(true);
    quests.invalidate();
    quests.repaint();
}
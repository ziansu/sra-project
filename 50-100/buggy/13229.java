@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (!(entities.isEmpty())) {
        if ((turnIndex) == ((entities.size()) - 1)) {
            turnIndex = 0;
        }else {
            (turnIndex)++;
        }
        currentEntity = entities.get(turnIndex);
        nameLabel.setText(currentEntity.getDescriptions().getName());
    }
}
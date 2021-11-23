@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.Integer newCount = count.get(0);
    newCount = newCount + 1;
    count.remove(0);
    count.add(newCount);
    if ((newCount > 0) && ((newCount % (players.size())) == 0)) {
        java.lang.Integer finalCount = newCount / 3;
        setText(("Turn " + (finalCount.toString())));
    }
    makeMove();
}
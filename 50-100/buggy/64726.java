public void actionPerformed(java.awt.event.ActionEvent e) {
    newInsert = false;
    ThisWhichStrategy tw = new ThisWhichStrategy();
    rule.setText(tw.getRule());
    if (!(essay.getText().equals(""))) {
        ListNode2[] array = tw.findInEssay(tree);
        displaySentences(array);
    }
}
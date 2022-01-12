private javax.swing.JCheckBox createProblematicKanjiCheckbox() {
    final javax.swing.JCheckBox problematicCheckbox = new javax.swing.JCheckBox(com.kanji.constants.Options.problematicKanjiOption);
    problematicCheckbox.addActionListener(new java.awt.event.ActionListener() {
        @java.lang.Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            int problematicKanjis = getProblematicKanjiNumber();
            if (problematicCheckbox.isSelected())
                sumOfWords += problematicKanjis;
            else
                sumOfWords -= problematicKanjis;
            
            updateSumOfWords();
        }
    });
    if ((getProblematicKanjiNumber()) == 0) {
        problematicCheckbox.setEnabled(false);
    }
    return problematicCheckbox;
}
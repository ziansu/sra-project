public void spaceBarPressed() {
    if (!(kanjisToBrowse.isEmpty())) {
        com.kanji.panels.ProblematicKanjiPanel.KanjiRow k = kanjisToBrowse.get(0);
        (repeatedProblematics)++;
        highlightRow(k);
        if (useInternet) {
            browseKanji(k.getPanel());
        }else {
            parentDialog.showKanjiDialog(excel.getKanjiById(k.getId()));
        }
    }
}
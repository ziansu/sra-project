public void spaceBarPressed(com.kanji.panels.ProblematicKanjiPanel.KanjiRow k) {
    (repeatedProblematics)++;
    highlightRow(k);
    if (useInternet) {
        browseKanji(k.getPanel());
    }else {
        parentDialog.showKanjiDialog(excel.getKanjiById(k.getId()));
    }
}
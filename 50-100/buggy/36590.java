@java.lang.Override
public void insertUpdate(javax.swing.event.DocumentEvent e) {
    main.AnimeIndex.saveModifiedInformation();
    util.MAMUtil.getJList().clearSelection();
    main.AnimeIndex.searchList.clearSelection();
    java.lang.String search = main.AnimeIndex.searchBar.getText();
    util.SortedListModel model = null;
    if ((main.AnimeIndex.filtro) == 9)
        model = util.MAMUtil.getModel();
    else
        model = main.AnimeIndex.filterModel;
    
    java.awt.CardLayout cl = ((java.awt.CardLayout) (main.AnimeIndex.cardContainer.getLayout()));
    cl.show(main.AnimeIndex.cardContainer, "Ricerca");
    SearchInList(search, model);
}
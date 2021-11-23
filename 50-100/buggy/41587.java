public model.Manuscript displayAllManuscript() {
    model.Manuscript toReturn = null;
    java.lang.System.out.println(myHelper);
    java.util.List<model.Manuscript> listOfManu = myRole.showAllManuscripts(myMasterList);
    displayManuscripts(listOfManu, true);
    int select2 = view.HelperGUI.getSelect(myConsole);
    if (select2 == ((listOfManu.size()) + 1)) {
        java.lang.System.out.println(HelperGUI.BACK);
    }else {
        toReturn = listOfManu.get((select2 - 1));
    }
    return toReturn;
}
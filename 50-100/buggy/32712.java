private void tagApplicable(de.blau.android.osm.Node possibleNode, de.blau.android.osm.Way possibleWay, boolean select) {
    if (possibleWay == null) {
        if (possibleNode != null) {
            if (select) {
                main.startActionMode(new de.blau.android.easyedit.EasyEditManager.NodeSelectionActionModeCallback(possibleNode));
            }
            main.performTagEdit(possibleNode, null, false);
        }
    }else {
        if (select) {
            main.startActionMode(new de.blau.android.easyedit.EasyEditManager.WaySelectionActionModeCallback(possibleWay));
        }
        main.performTagEdit(possibleWay, null, false);
    }
}
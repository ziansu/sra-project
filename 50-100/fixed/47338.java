private void saveAll() {
    originalList = new imp.data.PartList(0);
    notate.selectAll2();
    notate.adjustSelection();
    imp.data.PartList list = notate.getScore().getPartList();
    for (int i = 0; i < (list.size()); ++i) {
        imp.data.MelodyPart part = list.get(i).copy();
        originalList.add(part);
    }
    notate.repaint();
}
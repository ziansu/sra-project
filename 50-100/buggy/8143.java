private void fillCart(int elementPosition, int commandCount) {
    fr.upmc.ihm.restmenu.ImageItem item = getData(commandCount).get(elementPosition);
    data.add(item);
    gridAdapterMyCommand = new fr.upmc.ihm.restmenu.GridViewMyCommandAdapter(this, R.layout.grid_mycommand_element, data);
    if (inCart(elementPosition, commandCount)) {
        gridAdapterMyCommand.dataGetter().remove(POS);
    }
    gridViewMyCommand.setAdapter(gridAdapterMyCommand);
}
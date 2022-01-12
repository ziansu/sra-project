private void fillCart(int elementPosition, int commandCount, java.lang.String type) {
    fr.upmc.ihm.restmenu.ImageItem item = getData(commandCount, type).get(elementPosition);
    data.add(item);
    gridAdapterMyCommand = new fr.upmc.ihm.restmenu.GridViewMyCommandAdapter(this, R.layout.grid_mycommand_element, data);
    if (inCart(elementPosition, commandCount, type)) {
        gridAdapterMyCommand.dataGetter().remove(POS);
    }
    gridViewMyCommand.setAdapter(gridAdapterMyCommand);
}
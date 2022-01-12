private org.apache.wicket.Component createTypeCell(java.lang.String id, de.parkand.verschlag.schlag.mineral.MineralCategory type) {
    if (type == null) {
        return new org.apache.wicket.markup.html.basic.Label(id, "");
    }
    de.parkand.verschlag.html.wicket.panel.DescriptedCellPanel cell = new de.parkand.verschlag.html.wicket.panel.DescriptedCellPanel(id, org.apache.wicket.model.Model.of(Size.TINY));
    cell.add(createDescription(DescriptedCellPanel.DESCRIPTION, de.parkand.verschlag.html.wicket.panel.RatedMineralPanel.TYPE_DESCRIPTION, de.parkand.verschlag.html.wicket.panel.RatedMineralPanel.TYPE_DESCRIPTION_DEFAULT));
    cell.add(createLabel(DescriptedCellPanel.VALUE, type.name()));
    return cell;
}
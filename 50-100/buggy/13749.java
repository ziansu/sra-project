private void initialize() {
    addStyleName(TableCssName.SUBHEADER);
    iconTh = new gwt.material.design.client.ui.table.TableHeader();
    icon = new gwt.material.design.client.ui.MaterialIcon(openIcon);
    iconTh.add(icon);
    add(iconTh);
    nameTh = new gwt.material.design.client.ui.table.TableHeader();
    nameLbl = new gwt.material.design.client.ui.html.Text("Subheader");
    nameTh.add(nameLbl);
    add(nameTh);
    setName(category.getCategory());
    setId(category.getCategory());
}
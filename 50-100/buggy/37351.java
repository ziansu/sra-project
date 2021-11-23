public boolean collapse(boolean collapse) {
    seco.things.CellGroupMember nb = seco.notebook.NotebookDocument.getNBElement(getElement());
    collapsed = collapse;
    if (nb instanceof seco.things.CellGroup) {
        collapsed = false;
    }else
        if (nb instanceof seco.things.Cell) {
            {
                for (int i = 1; i < (getViewCount()); i++)
                    ((seco.notebook.view.HidableView) (getView(i))).setVisible((!(collapsed)));
                
            }
        }
    
    return collapsed;
}
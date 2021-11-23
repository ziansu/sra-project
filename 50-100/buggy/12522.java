@java.lang.Override
public boolean isApplicable(model.AtomData data) {
    if (((toDeltaColumn) == null) && ((toDeltaID) != null)) {
        for (model.DataColumnInfo d : data.getDataColumnInfos()) {
            if (d.getId().equals(toDeltaID)) {
                this.toDeltaColumn = d;
            }
        }
    }
    return (((data.getNext()) != null) || ((data.getPrevious()) != null)) && ((this.toDeltaColumn) != null);
}
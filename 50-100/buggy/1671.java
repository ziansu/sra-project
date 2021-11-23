public thoth_lib_m.dataclass.CopyTable getIArray(int row) throws java.lang.Exception {
    thoth_lib_m.dataclass.CopyTable copy = new thoth_lib_m.dataclass.CopyTable((-1));
    if ((model) instanceof thoth_lib_m.guiclass.TableCopiesModel) {
        copy = ((thoth_lib_m.guiclass.TableCopiesModel) (model)).getIArray(row);
    }
    return copy;
}
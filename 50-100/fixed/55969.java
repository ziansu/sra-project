@java.lang.Override
public boolean run(Database.DBObjects.JEXEntry optionalEntry) {
    if (((myData) == null) || (!((myData.getTypeName().getType().equals(JEXData.FILE)) || (myData.getTypeName().getType().equals(JEXData.IMAGE))))) {
        return false;
    }else {
        function.plugin.plugins.dataEditing.SplitObjectToSeparateEntries.theData = myData;
    }
    return true;
}
@java.lang.Override
public boolean run(Database.DBObjects.JEXEntry optionalEntry) {
    if (((function.plugin.plugins.dataEditing.SplitObjectToSeparateEntries.theData) == null) || (!((function.plugin.plugins.dataEditing.SplitObjectToSeparateEntries.theData.getTypeName().getType().equals(JEXData.FILE)) || (function.plugin.plugins.dataEditing.SplitObjectToSeparateEntries.theData.getTypeName().getType().equals(JEXData.IMAGE))))) {
        return false;
    }else {
        function.plugin.plugins.dataEditing.SplitObjectToSeparateEntries.theData = myData;
    }
    return true;
}
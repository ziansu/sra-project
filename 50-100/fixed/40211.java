public static void init() {
    core.GlobalAttributeHolder.instance = new core.GlobalAttributeHolder();
    core.GlobalAttributeHolder.instance.setEventTypeByAttributes(utils.EventAttributeSeparator.getEventTypeByAttributesMap());
    core.GlobalAttributeHolder.instance.setAdditionalAttributes(utils.Utilities.fileAsSet(utils.FileManager.getInstance().getPath("data/newdesign/SpAttr_table")));
    core.GlobalAttributeHolder.instance.setDbTablesByAttributes(utils.EventAttributeSeparator.getDbTablesByAttributesMap());
    core.GlobalAttributeHolder.instance.setAttributeDataTypeMap(utils.Utilities.getAttributesMap(utils.FileManager.getInstance().getPath("data/old-design/Parameter_Types.txt")));
}
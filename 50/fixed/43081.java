public boolean typeCheck(java.lang.String fieldName, uk.ac.imperial.lsds.seep.api.data.Type type) {
    return (fields[mapFieldNameToFieldPosition.get(fieldName)].toString().compareTo(type.toString())) == 0;
}
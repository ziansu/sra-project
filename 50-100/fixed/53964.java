public java.util.List<de.opitzconsulting.orcas.ot.FieldData> getFiledDataList() {
    java.util.Collections.sort(_filedDataList, new java.util.Comparator<de.opitzconsulting.orcas.ot.FieldData>() {
        public int compare(de.opitzconsulting.orcas.ot.FieldData pO1, de.opitzconsulting.orcas.ot.FieldData pO2) {
            return pO1.getJavaName().compareTo(pO2.getJavaName());
        }
    });
    return new java.util.ArrayList<de.opitzconsulting.orcas.ot.FieldData>(_filedDataList);
}
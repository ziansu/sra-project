public java.util.List<org.eclipse.hawkbit.mgmt.json.model.target.MgmtTargetRequestBody> buildAsList(final int offset, final int count) {
    final java.util.List<org.eclipse.hawkbit.mgmt.json.model.target.MgmtTargetRequestBody> bodyList = java.util.Arrays.asList();
    for (int index = offset; index < (count + offset); index++) {
        bodyList.add(doBuild(java.lang.String.format("%06d", index)));
    }
    return bodyList;
}
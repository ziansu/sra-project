@java.lang.Override
public void init() {
    setPackage(mapperPackage);
    addAttribute(org.molgenis.data.mapper.meta.AttributeMappingMetaData.IDENTIFIER, org.molgenis.data.meta.model.EntityMetaData.AttributeRole.ROLE_ID);
    addAttribute(org.molgenis.data.mapper.meta.AttributeMappingMetaData.TARGETATTRIBUTEMETADATA).setNillable(false);
    addAttribute(org.molgenis.data.mapper.meta.AttributeMappingMetaData.SOURCEATTRIBUTEMETADATAS);
    addAttribute(org.molgenis.data.mapper.meta.AttributeMappingMetaData.ALGORITHM).setDataType(org.molgenis.MolgenisFieldTypes.AttributeType.TEXT);
    java.util.List<java.lang.String> options = java.util.Arrays.asList(org.molgenis.data.mapper.mapping.model.AttributeMapping.AlgorithmState.values()).stream().map(AlgorithmState::toString).collect(java.util.stream.Collectors.toList());
    addAttribute(org.molgenis.data.mapper.meta.AttributeMappingMetaData.ALGORITHMSTATE).setDataType(org.molgenis.MolgenisFieldTypes.AttributeType.ENUM).setEnumOptions(options);
}
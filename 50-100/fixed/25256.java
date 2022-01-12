public static com.mbrlabs.mundus.editor.core.kryo.descriptors.ProjectSettingsDescriptor convert(com.mbrlabs.mundus.editor.core.project.ProjectSettings settings) {
    com.mbrlabs.mundus.editor.core.kryo.descriptors.ProjectSettingsDescriptor descriptor = new com.mbrlabs.mundus.editor.core.kryo.descriptors.ProjectSettingsDescriptor();
    descriptor.setExportAllAssets(settings.getExport().allAssets);
    descriptor.setExportCompressScenes(settings.getExport().compressScenes);
    if ((settings.getExport().outputFolder) != null) {
        descriptor.setExportOutputFolder(settings.getExport().outputFolder.path());
    }
    descriptor.setJsonType(settings.getExport().jsonType.toString());
    return descriptor;
}
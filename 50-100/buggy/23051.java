private com.sinewang.kiimate.model.core.api.Receipt buildReceipt(final java.lang.String extId) {
    one.kii.kiimate.model.core.dai.ExtensionDai.Extension extension = extensionDai.selectExtensionById(extId);
    com.sinewang.kiimate.model.core.api.Receipt receipt = one.kii.summer.beans.utils.DataTools.copy(extension, com.sinewang.kiimate.model.core.api.Receipt.class);
    receipt.setExtId(extension.getId());
    java.util.List<one.kii.kiimate.model.core.dai.IntensionDai.Intension> intensionList = intensionDai.selectIntensionsByExtId(extId);
    java.util.List<com.sinewang.kiimate.model.core.api.Intension> intensions = one.kii.summer.beans.utils.DataTools.copy(intensionList, com.sinewang.kiimate.model.core.api.Intension.class);
    receipt.setIntensions(intensions);
    receipt.setSchema(modelRestorer.restoreAsMetaData(extId));
    return receipt;
}
public java.util.List<com.netflix.imflibrary.st0377.HeaderPartition.EssenceTypeEnum> getEssenceTypes() {
    java.util.List<com.netflix.imflibrary.st0377.HeaderPartition.EssenceTypeEnum> essenceTypes = new java.util.ArrayList<>();
    if ((this.hasCDCIPictureEssenceDescriptor()) || (this.hasRGBAPictureEssenceDescriptor())) {
        essenceTypes.add(com.netflix.imflibrary.st0377.HeaderPartition.EssenceTypeEnum.MainImageEssence);
    }
    if (this.hasWaveAudioEssenceDescriptor()) {
        essenceTypes.add(com.netflix.imflibrary.st0377.HeaderPartition.EssenceTypeEnum.MainAudioEssence);
    }else {
        essenceTypes.add(com.netflix.imflibrary.st0377.HeaderPartition.EssenceTypeEnum.UnknownEssence);
    }
    return essenceTypes;
}
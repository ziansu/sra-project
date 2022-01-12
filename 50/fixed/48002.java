private void selectFromTarget(java.lang.String targetBoneName) {
    assert targetBoneName != null;
    java.lang.String sourceBoneName = sourceBoneName(targetBoneName);
    if (sourceBoneName != null) {
        Maud.model.getSource().bone.select(sourceBoneName);
        Maud.model.target.bone.select(targetBoneName);
    }
}
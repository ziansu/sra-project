public lahome.rotateTool.module.RotateItem getPart(java.lang.String partNum) {
    for (lahome.rotateTool.module.RotateItem rotateItem : PartsList) {
        if ((partNum.compareTo(rotateItem.getPartNumber())) == 0) {
            return rotateItem;
        }
    }
    return null;
}
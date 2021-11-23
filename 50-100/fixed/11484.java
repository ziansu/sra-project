private java.lang.String buildContainerId() {
    java.lang.String id;
    java.lang.String selectElementId = selectElement.getId();
    if ((selectElementId != null) && ((selectElementId.length()) > 0)) {
        id = com.arcbees.chosen.client.ChosenImpl.containerIdRegExp.replace(selectElementId, "_");
    }else {
        id = generateContainerId();
        selectElement.setId(id);
    }
    id += "_chzn";
    return id;
}
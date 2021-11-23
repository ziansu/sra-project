public model.player.StatusRenderInformation returnStatusRenderInformation() {
    model.player.StatusRenderInformation renderInfo = new model.player.StatusRenderInformation();
    renderInfo.updateModeString(getCurrentMode());
    renderInfo.updateTypeString(getCurrentType());
    renderInfo.updateInstanceString(getCurrentInstance());
    renderInfo.updateCommandString(getCurrentCommand().toString());
    return renderInfo;
}
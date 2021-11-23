public void stopMotion() {
    fi.dy.masa.minecraft.mods.multishot.state.State.setMotion(false);
    this.stateMoveToStart = false;
    this.startMotion = false;
    if ((fi.dy.masa.minecraft.mods.multishot.state.State.getRecording()) == true) {
        fi.dy.masa.minecraft.mods.multishot.worker.RecordingHandler.getInstance().stopRecording();
    }
    net.minecraft.client.Minecraft.getMinecraft().setIngameFocus();
}
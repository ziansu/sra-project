public void stopMotion() {
    if ((fi.dy.masa.minecraft.mods.multishot.state.State.getRecording()) == true) {
        fi.dy.masa.minecraft.mods.multishot.worker.RecordingHandler.getInstance().stopRecording();
    }
    fi.dy.masa.minecraft.mods.multishot.state.State.setMotion(false);
    this.stateMoveToStart = false;
    this.startMotion = false;
    net.minecraft.client.Minecraft.getMinecraft().setIngameFocus();
}
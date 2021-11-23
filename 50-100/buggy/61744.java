@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void RenderGameOverlayEvent(net.minecraftforge.client.event.RenderGameOverlayEvent event) {
    if (com.kerbybit.chattriggers.globalvars.global.canUse) {
        com.kerbybit.chattriggers.commands.CommandReference.clickCalc();
        (com.kerbybit.chattriggers.globalvars.global.framesElapsed)++;
        com.kerbybit.chattriggers.overlay.KillfeedHandler.drawKillfeed(event);
        com.kerbybit.chattriggers.overlay.NotifyHandler.drawNotify(event);
        com.kerbybit.chattriggers.objects.DisplayHandler.drawDisplays(event);
        com.kerbybit.chattriggers.gui.GuiTriggerList.openGui();
        com.kerbybit.chattriggers.gui.DisplayOverlay.openGui();
        com.kerbybit.chattriggers.file.FileHandler.firstFileLoad();
        try {
            com.kerbybit.chattriggers.triggers.TriggerHandler.worldLoadTriggers();
        } catch (java.lang.NullPointerException e) {
        }
        com.kerbybit.chattriggers.triggers.TriggerHandler.newDayTriggers();
        com.kerbybit.chattriggers.globalvars.global.worldLoaded = false;
    }
}
@java.lang.Override
public void onActionActivate(buildcraft.api.transport.pipe.PipeEventActionActivate event) {
    super.onActionActivate(event);
    if ((event.action) instanceof buildcraft.transport.statements.ActionExtractionPreset) {
        buildcraft.transport.statements.ActionExtractionPreset preset = ((buildcraft.transport.statements.ActionExtractionPreset) (event.action));
        activeSlots.add(preset.index);
        activatedTtl[preset.index.ordinal()] = 2;
    }
}
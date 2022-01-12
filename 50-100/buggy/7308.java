@java.lang.Override
public void getTooltip(binnie.core.craftgui.Tooltip tooltip) {
    if ((species) == null) {
        return ;
    }
    switch (discovered) {
        case SHOW :
            tooltip.add(species.getName());
            break;
        case DISCOVERED :
            tooltip.add(binnie.core.util.I18N.localise("binniecore.gui.database.discovered.discovered"));
            break;
        case UNDISCOVERED :
            tooltip.add(binnie.core.util.I18N.localise("binniecore.gui.database.discovered.undiscovered"));
            break;
    }
}
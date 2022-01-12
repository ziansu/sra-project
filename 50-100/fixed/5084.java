@java.lang.Override
public void actionPerformed(final java.awt.event.ActionEvent e) {
    if ((panel) == null) {
        mpicbg.spim.io.IOFunctions.println(("Panel not set for " + (this.getClass().getSimpleName())));
        return ;
    }
    ((gui.StitchingExplorerPanel<?, ?>) (panel)).togglePreviewMode(false);
}
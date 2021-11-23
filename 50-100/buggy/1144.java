public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((bbms.GlobalFuncs.selectedUnit) != null) {
        if ((GlobalFuncs.selectedUnit.target) != null) {
            if (bbms.GlobalFuncs.RotateHull)
                GlobalFuncs.selectedUnit.OrientHullTo(GlobalFuncs.selectedUnit.target.location.x, GlobalFuncs.selectedUnit.target.location.y);
            else
                GlobalFuncs.selectedUnit.OrientTurretTo(GlobalFuncs.selectedUnit.target.location.x, GlobalFuncs.selectedUnit.target.location.y);
            
            GlobalFuncs.gui.repaint();
            gui.GUI_NB.GCO("Orienting on target");
        }
    }
}
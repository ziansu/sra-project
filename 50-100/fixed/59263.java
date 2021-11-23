private void processNotification(cfa.vo.iris.sed.ExtSed sed, cfa.vo.iris.events.SedCommand payload) {
    if (SedCommand.ADDED.equals(payload)) {
        update(sed);
    }else
        if (SedCommand.REMOVED.equals(payload)) {
            remove(sed);
        }else
            if (SedCommand.SELECTED.equals(payload)) {
                setSelectedSed(sed);
                fire(sed, VisualizerCommand.SELECTED);
            }else {
                setSelectedSed(sed);
                fire(sed, VisualizerCommand.REDRAW);
            }
        
    
}
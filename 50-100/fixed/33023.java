@java.lang.Override
public void selectedViewDescriptions(final java.util.List<java.util.List<mpicbg.spim.data.generic.sequence.BasicViewDescription<? extends mpicbg.spim.data.generic.sequence.BasicViewSetup>>> viewDescriptions) {
    final java.util.ArrayList<mpicbg.spim.data.generic.sequence.BasicViewDescription<? extends mpicbg.spim.data.generic.sequence.BasicViewSetup>> fullList = new java.util.ArrayList<>();
    for (final java.util.List<mpicbg.spim.data.generic.sequence.BasicViewDescription<? extends mpicbg.spim.data.generic.sequence.BasicViewSetup>> list : viewDescriptions)
        for (final mpicbg.spim.data.generic.sequence.BasicViewDescription<? extends mpicbg.spim.data.generic.sequence.BasicViewSetup> vd : list)
            if (vd.isPresent())
                fullList.add(vd);
            
        
    
    panel.updateViewDescription(fullList);
}
@java.lang.Override
protected void reset() {
    super.reset();
    for (edu.berkeley.path.beats.control.Controller_HOT_Lookup.LinkData ld : linkData.values())
        ld.reset();
    
}
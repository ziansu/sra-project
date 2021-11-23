@java.lang.Override
public void setName(java.lang.String s) {
    super.setName(s);
    if (net.techcable.npclib.nms.NMSLivingNPC.isSpawned())
        net.techcable.npclib.nms.NMSLivingNPC.getHook().setName(s);
    
}
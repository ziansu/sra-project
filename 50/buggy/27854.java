@java.lang.Override
public void setName(java.lang.String s) {
    this.name = s;
    if (net.techcable.npclib.nms.NMSLivingNPC.isSpawned())
        net.techcable.npclib.nms.NMSLivingNPC.getHook().setName(s);
    
}
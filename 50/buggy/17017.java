@java.lang.Override
public void startExecuting() {
    fmodeBase.startBlock(theMaid.maidMode);
    if ((theMaid.getMaidModeInt()) == (LMM_EntityMode_Torcher.mmode_Torcher)) {
        theMaid.playLittleMaidSound(LMM_EnumSound.findTarget_D, true);
    }
}
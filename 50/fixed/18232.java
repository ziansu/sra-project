@java.lang.Override
public void run() {
    MainAttack(oAttacker, oTarget);
    contagionJVM.System.NWScript.deleteLocalInt(oAttacker, "TEMP_DISABLE_FIRING");
}
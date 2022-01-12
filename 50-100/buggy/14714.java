public static void OnAreaEnter(org.nwnx.nwnx2.jvm.NWObject oPC) {
    if ((((!(org.nwnx.nwnx2.jvm.NWScript.getIsPC(oPC))) || (org.nwnx.nwnx2.jvm.NWScript.getIsDM(oPC))) || ((org.nwnx.nwnx2.jvm.NWScript.getLocalInt(oPC, "MIGRATION_SYSTEM_LOGGED_IN_ONCE")) == 1)) || (org.nwnx.nwnx2.jvm.NWScript.getTag(org.nwnx.nwnx2.jvm.NWScript.getArea(oPC)).equals("ooc_area")))
        return ;
    
    contagionJVM.System.MigrationSystem.PerformMigration(oPC);
}
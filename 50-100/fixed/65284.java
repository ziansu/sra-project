public synchronized void Addheader(boolean first) {
    java.lang.String temp = "";
    if (first) {
        temp = "                               Game of the Rope - Description of the internal state" + (("\n\n" + "Ref Coa 1 Cont 1 Cont 2 Cont 3 Cont 4 Cont 5 Coa 2 Cont 1 Cont 2 Cont 3 Cont 4 Cont 5     Trial    \n") + "Sta  Stat Sta SG Sta SG Sta SG Sta SG Sta SG  Stat Sta SG Sta SG Sta SG Sta SG Sta SG 3 2 1 . 1 2 3 NB PS\n");
        TO_WRITE += temp;
    }else {
        temp = (("Game " + (shared_mem.MGeneralInfoRepo.game_nr)) + " \nRef Coa 1 Cont 1 Cont 2 Cont 3 Cont 4 Cont 5 Coa 2 Cont 1 Cont 2 Cont 3 Cont 4 Cont 5     Trial    \n") + "Sta  Stat Sta SG Sta SG Sta SG Sta SG Sta SG  Stat Sta SG Sta SG Sta SG Sta SG Sta SG 3 2 1 . 1 2 3 NB PS\n";
        TO_WRITE += temp;
    }
}
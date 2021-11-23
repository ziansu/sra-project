private void role2actionRelative(kariminf.sentrep.univ.types.Relation.Relative rel) {
    java.util.List<kariminf.faris.process.ston.FarisParse.TmpRelative> listRel = new java.util.ArrayList<kariminf.faris.process.ston.FarisParse.TmpRelative>();
    subsRel.put(currentPlayerID, listRel);
    java.lang.System.out.println(rel);
    kariminf.faris.process.ston.FarisParse.TmpRelative tr = new kariminf.faris.process.ston.FarisParse.TmpRelative();
    tr.rel = rel;
    tr.RelDisj = RelDisj;
    tr.substance = currentPlayer;
    listRel.add(tr);
}
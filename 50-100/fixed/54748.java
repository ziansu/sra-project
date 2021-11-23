public void changeAbbrRecords(java.lang.String oldAbbr, java.lang.String newAbbr) {
    CFBsimPack.LeagueRecords.Record r;
    for (java.lang.String s : recordsList) {
        r = records.get(s);
        if ((r != null) && (r.getHolder().split(" ")[0].equals(oldAbbr))) {
            r.changeAbbr(newAbbr);
        }
    }
}
public java.lang.String convert(dk.medicinkortet.dosisstructuretext.vowrapper.UnitOrUnitsWrapper unitOrUnits, dk.medicinkortet.dosisstructuretext.vowrapper.StructureWrapper structure) {
    java.lang.StringBuilder s = new java.lang.StringBuilder();
    appendDosageStart(s, structure.getStartDateOrDateTime());
    s.append(", forløbet gentages hver uge");
    appendDosageEnd(s, structure.getEndDateOrDateTime());
    appendNoteText(s, structure);
    s.append(((dk.medicinkortet.dosisstructuretext.TextHelper.INDENT) + "Doseringsforl\u00f8b:\n"));
    appendDays(s, unitOrUnits, structure);
    return s.toString();
}
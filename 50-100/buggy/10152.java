protected org.rikai.dictionary.edict.EdictEntry buildEntry(org.rikai.dictionary.db.ResultCursor cursor, org.rikai.deinflector.DeinflectedWord variant) {
    java.lang.String reason = "";
    if ((variant.getReason()) != "") {
        reason = (("< " + (variant.getReason())) + " < ") + (variant.getOriginalWord());
    }
    return makeEntry(variant, cursor.getValue("kanji"), cursor.getValue("kana"), cursor.getValue("entry"), reason);
}
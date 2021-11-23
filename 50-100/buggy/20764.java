public int compare(de.citec.sc.matoll.core.LexicalEntry one, de.citec.sc.matoll.core.LexicalEntry two) {
    return (((de.citec.sc.matoll.core.LexicalEntry) (one)).getProvenance().getConfidence()) > (((de.citec.sc.matoll.core.LexicalEntry) (two)).getProvenance().getConfidence()) ? -1 : 1;
}
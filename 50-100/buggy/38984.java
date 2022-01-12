private void doc(com.redhat.ceylon.compiler.typechecker.model.ClassOrInterface c) throws java.io.IOException {
    open("tr class='TableRowColor'");
    open("td");
    around("span class='modifiers'", com.redhat.ceylon.ceylondoc.Util.getModifiers(c));
    close("td");
    open("td");
    writeIcon(c);
    link(c.getType());
    tag("br");
    startPrintingLongDoc(c);
    writeBy(c);
    writeSee(c);
    writeTagged(c);
    endLongDocAndPrintShortDoc(c);
    close("td");
    close("tr");
}
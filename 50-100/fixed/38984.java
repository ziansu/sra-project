private void doc(com.redhat.ceylon.compiler.typechecker.model.ClassOrInterface c) throws java.io.IOException {
    open("tr class='TableRowColor'");
    open("td");
    around("span class='modifiers'", com.redhat.ceylon.ceylondoc.Util.getModifiers(c));
    close("td");
    open("td");
    writeIcon(c);
    link(c.getType());
    writeTagged(c);
    tag("br");
    startPrintingLongDoc(c);
    writeBy(c);
    writeSee(c);
    endLongDocAndPrintShortDoc(c);
    close("td");
    close("tr");
}
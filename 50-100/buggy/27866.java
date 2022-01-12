public void actionPerformed(java.awt.event.ActionEvent ae) {
    java.lang.String annotType = de.uka.ipd.idaho.im.util.ImUtils.promptForObjectType("Enter Annotation Type", "Enter or select type of annotations to create", annotTypes, null, true);
    if (annotType != null) {
        invoker.beginAtomicAction("Annotate All");
        annotateAll(idmp.document, start, end, annotType);
        invoker.endAtomicAction();
        invoker.setAnnotationsPainted(annotType, true);
        invoker.validate();
        invoker.repaint();
    }
}
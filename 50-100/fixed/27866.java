public void actionPerformed(java.awt.event.ActionEvent ae) {
    invoker.beginAtomicAction("Annotate All");
    annotateAll(idmp.document, start, end, annotType);
    invoker.setAnnotationsPainted(annotType, true);
    invoker.endAtomicAction();
    invoker.validate();
    invoker.repaint();
}
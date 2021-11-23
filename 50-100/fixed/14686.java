private boolean RichTextComponent() {
    begin("RichTextComponent");
    if (Link()) {
        sem.RichTextComponent_0();
        return accept();
    }
    if (CursiveText()) {
        sem.RichTextComponent_1();
        return accept();
    }
    if (Template()) {
        sem.RichTextComponent_2();
        return accept();
    }
    if (RichTextComponent_0()) {
        sem.RichTextComponent_3();
        return accept();
    }
    return reject();
}
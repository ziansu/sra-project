@java.lang.Override
public void run() {
    for (unalcol.language.programming.lexer.Token t : changes) {
        doc.setCharacterAttributes(t.pos().offset(), t.length(), doc.getStyle(token_style.get(t.type())), true);
    }
}
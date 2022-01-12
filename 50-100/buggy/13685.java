static void pasteFromStringBuffer(editor.Line line) {
    java.lang.System.out.print("Insert At?\t");
    int insertPosition = 0;
    try {
        insertPosition = java.lang.Integer.parseInt(editor.Editor.in.nextLine());
        if ((insertPosition < 0) || (insertPosition > (line.length()))) {
            throw new java.lang.Exception();
        }
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Invalid position");
        return ;
    }
    line.insert(insertPosition, editor.Editor.stringCopyBuffer);
}
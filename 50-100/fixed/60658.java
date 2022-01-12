private void LangSelectorActionPerformed() {
    int select = LangSelector.getSelectedIndex();
    if (select == 0)
        CodeArea.setText(test.CodeFormat.cCode());
    else
        if (select == 1)
            CodeArea.setText(test.CodeFormat.cppCode());
        else
            if (select == 2) {
                CodeArea.setText(test.CodeFormat.javaCode());
            }
        
    
}
@java.lang.Override
public void focusGained(java.awt.event.FocusEvent e) {
    for (int compNum = 0; compNum < (options.length); compNum++) {
        if ((e.getSource()) == (arrowBtns[compNum])) {
            options[compNum].setBorder(mainStyle.borderFocused);
            java.lang.System.out.println("b");
        }
    }
}
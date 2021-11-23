public static void updateHistory(java.lang.String input) {
    if (!(input.isEmpty())) {
        while (!(ui.list.swing.TextFieldHistory.temp.isEmpty())) {
            ui.list.swing.TextFieldHistory.history.push(ui.list.swing.TextFieldHistory.temp.pop());
        } 
        ui.list.swing.TextFieldHistory.history.push(input);
    }
}
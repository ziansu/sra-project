@org.junit.Test
public void add_tabAutocomplete_success() {
    for (int i = 1; i < (AddCommand.COMMAND_WORD.length()); ++i) {
        assertAddTabAutocomplete(AddCommand.COMMAND_WORD.substring(0, i));
    }
    assertAddTabAutocomplete(((seedu.multitasky.logic.commands.AddCommand.COMMAND_WORD) + "a"));
    assertAddTabAutocomplete(((seedu.multitasky.logic.commands.AddCommand.COMMAND_WORD) + "aa"));
    assertAddTabAutocomplete(((seedu.multitasky.logic.commands.AddCommand.COMMAND_WORD) + "aaa"));
}
@org.junit.Test
public void parse_validArgs_returnsFindCommand() {
    seedu.address.logic.commands.FindCommand expectedFindCommand = new seedu.address.logic.commands.FindCommand(new seedu.address.model.person.NameContainsKeywordsPredicate(java.util.Arrays.asList("Alice", "Bob", "AB")));
    seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess(parser, "Alice Bob", expectedFindCommand);
    seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess(parser, " \n Alice \n \t Bob  \t", expectedFindCommand);
}
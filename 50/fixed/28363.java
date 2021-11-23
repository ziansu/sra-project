@org.junit.Test
public void overridesNestedRule() {
    fitnesse.wikitext.parser.ParserTestHelper.assertTranslatesTo("|\'\'|\n", tableWithCell("''", true));
    fitnesse.wikitext.parser.ParserTestHelper.assertTranslatesTo("|\'\'a|\n\'\'", ((tableWithCell("''a")) + "''"));
}
@org.junit.Test
public void factor7() throws cop5555sp15.SimpleParser.SyntaxException {
    java.lang.String input = "class A {def C={->x= &y; z = !y;};} ";
    parseIncorrectInput(input, cop5555sp15.AND);
}
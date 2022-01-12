@java.lang.Override
protected de.uni_koblenz.jgralab.codegenerator.CodeBlock createHeader() {
    de.uni_koblenz.jgralab.codegenerator.CodeSnippet s = new de.uni_koblenz.jgralab.codegenerator.CodeSnippet();
    s.add((("public class " + (classname)) + " extends AbstractExecutableQuery implements ExecutableQuery {"));
    return s;
}
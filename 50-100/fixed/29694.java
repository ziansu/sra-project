public static void main(java.lang.String[] args) {
    com.structurizr.Workspace workspace = com.structurizr.example.ExampleWorkspace.create();
    java.io.StringWriter stringWriter = new java.io.StringWriter();
    com.structurizr.io.dot.DotWriter dotWriter = new com.structurizr.io.dot.DotWriter();
    dotWriter.write(workspace, stringWriter);
    java.lang.System.out.println(stringWriter);
}
@java.lang.Override
public void execute() {
    processMessages();
    generateMessages();
    java.lang.System.out.println((((((("id: " + (process.getID())) + ", ") + "dist: ") + (dist)) + ", ") + (marked ? "parent: " + (parent.getID()) : "")));
}
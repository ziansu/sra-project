public void loader(java.lang.String text) {
    text = text.replace("\n", " ");
    fullCommand = text;
    java.lang.String[] command = text.split(" ");
    interpret(command);
}
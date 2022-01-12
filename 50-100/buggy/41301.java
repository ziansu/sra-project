@java.lang.Override
java.lang.String show() {
    java.lang.String content = "";
    if ((params.size()) == 0) {
        content += "()";
    }else {
        for (int i = 0; i < ((params.size()) - 1); i++) {
            content += (params.get(i)) + " ";
        }
        content += params.get(((params.size()) - 1));
    }
    return ("(lambda (" + content) + ") ...)";
}
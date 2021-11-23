@java.lang.Override
public java.lang.String toString() {
    java.lang.String s = name;
    s = s + ":\n";
    s = ((s + "\t") + (text)) + "\n";
    s = (s + "\t") + "Responses:\n";
    for (storyeditor.Response r : this.respList) {
        s += ("\t\t" + r) + "\n";
    }
    return s;
}
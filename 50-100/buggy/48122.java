public void addlabel(compilator.content.Label lbl) {
    compilator.content.Label[] temp = this.labels;
    int prevlength = temp.length;
    compilator.content.Label[] newarray = new compilator.content.Label[prevlength + 1];
    for (int i = 0; i < prevlength; i++) {
        newarray[i] = temp[i];
    }
    newarray[prevlength] = lbl;
    this.labels = newarray;
}
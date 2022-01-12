private de.ailis.pherialize.Mixed unserializeInteger() {
    java.lang.Integer result;
    int pos;
    pos = this.data.indexOf(';', ((this.pos) + 2));
    result = java.lang.Integer.valueOf(this.data.substring(((this.pos) + 2), pos));
    this.pos = pos + 1;
    return new de.ailis.pherialize.Mixed(result);
}
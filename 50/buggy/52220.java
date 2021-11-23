public java.lang.String toString() {
    java.lang.String ret = "";
    if ((this.type) == (lambdaland.Variation.VToken.VTokenType.DIMENSION)) {
        ret += "dimension ";
    }else {
        ret += "alternative ";
    }
    ret += this.id;
    return ret;
}
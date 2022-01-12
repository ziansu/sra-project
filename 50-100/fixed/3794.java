@java.lang.Override
public org.nschmidt.csgn.Triangle clone() {
    return new org.nschmidt.csgn.Triangle(df, this.vertices[0].clone(), this.vertices[1].clone(), this.vertices[2].clone(), new org.nschmidt.ldparteditor.data.GColourIndex(colour.getColour(), colour.getIndex()));
}
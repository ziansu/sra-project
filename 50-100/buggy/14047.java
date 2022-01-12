public static android.graphics.Rect whatAreMyDims(int location) {
    android.graphics.Rect ret = new android.graphics.Rect();
    ret.top = com.ds.avare.shapes.SubTile.dims[location][0];
    ret.left = com.ds.avare.shapes.SubTile.dims[location][1];
    ret.bottom = ((com.ds.avare.shapes.SubTile.dims[location][0]) + 128) - 1;
    ret.right = ((com.ds.avare.shapes.SubTile.dims[location][1]) + 128) - 1;
    return ret;
}
@java.lang.Override
public boolean equals(java.lang.Object obj) {
    boolean returnValue = false;
    if (obj instanceof com.ray3k.skincomposer.data.DrawableData) {
        com.ray3k.skincomposer.data.DrawableData dd = ((com.ray3k.skincomposer.data.DrawableData) (obj));
        if ((dd.file.equals(file)) && ((((tint) == null) && ((dd.tint) == null)) || (tint.equals(dd.tint)))) {
            returnValue = true;
        }
    }
    return returnValue;
}
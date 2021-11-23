@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (java.util.Map.Entry<java.io.File, de.adrodoc55.minecraft.mpl.compilation.CompilerException> it : exceptions.entries()) {
        sb.append(it.toString());
        sb.append('\n');
    }
    return sb.toString();
}
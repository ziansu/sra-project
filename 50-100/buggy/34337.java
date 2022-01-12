@java.lang.Override
public byte[] transform(java.lang.String s, java.lang.String s1, byte[] bytes) {
    if (s.equalsIgnoreCase("zs")) {
        java.lang.System.out.println("Patching ItemFood...");
        return patchClassASM(s, bytes, true);
    }
    if (s.equalsIgnoreCase("net.minecraft.item.ItemFood")) {
        java.lang.System.out.println("Patching ItemFood...");
        return patchClassASM(s, bytes, false);
    }
    return null;
}
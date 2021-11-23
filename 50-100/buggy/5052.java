public static net.minecraft.util.BlockPos stringCSVToBlockPos(java.lang.String csv) {
    java.lang.String[] spl = csv.split(",");
    net.minecraft.util.BlockPos p = null;
    try {
        p = new net.minecraft.util.BlockPos(java.lang.Integer.parseInt(spl[0]), java.lang.Integer.parseInt(spl[1]), java.lang.Integer.parseInt(spl[2]));
    } catch (java.lang.ClassCastException e) {
        java.lang.System.out.println(("stringCSV " + csv));
        java.lang.System.out.println(e.getMessage());
    }
    return p;
}
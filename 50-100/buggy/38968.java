public static void main(java.lang.String[] args) throws java.lang.Exception {
    java.util.List<java.lang.String> lines = AdventUtil.AdventFileReader.getLines("Day12input.txt");
    for (java.lang.String line : lines) {
        java.lang.System.out.println(("Part 1: " + (Days.Day12.Day12.getValue(new Days.Day12.JSONArray(line), false))));
        java.lang.System.out.println(("Part 2: " + (Days.Day12.Day12.getValue(new Days.Day12.JSONArray(line), true))));
    }
}
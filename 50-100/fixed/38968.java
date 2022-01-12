public static void main(java.lang.String[] args) throws java.lang.Exception {
    java.util.List<java.lang.String> lines = AdventUtil.AdventFileReader.getLines("Day12input.txt");
    java.lang.System.out.println(("Part 1: " + (Days.Day12.Day12.getValue(lines.get(0), false))));
    java.lang.System.out.println(("Part 2: " + (Days.Day12.Day12.getValue(lines.get(0), true))));
}
public static void main(java.lang.String[] args) {
    final com.riotgames.sample.CalcApp app = new com.riotgames.sample.CalcApp();
    final java.lang.StringBuilder outputs = new java.lang.StringBuilder();
    java.util.Arrays.asList(args).forEach(( value) -> outputs.append((value + " ")));
    java.lang.System.out.print((("Addition of values: " + outputs) + " = "));
    java.lang.System.out.println(app.calc3(args));
}
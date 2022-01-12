protected static void PrintFunctionIn(java.lang.StringBuilder Str, java.lang.String Type) {
    Str.append((((("CREATE OR REPLACE FUNCTION TILDA.In(v " + Type) + "[], vals ") + Type) + "[])\n")).append("  RETURNS boolean\n").append("  IMMUTABLE LANGUAGE SQL AS\n").append("  \'select v && vals;\';\n").append("\n").append("\n");
}
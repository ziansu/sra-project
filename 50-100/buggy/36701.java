public void dump(java.lang.String input) {
    java.util.List<hu.nytud.hfst.Main.Result> res = run(input);
    if (res.isEmpty())
        java.lang.System.out.println("\t <unknown>");
    
    for (hu.nytud.hfst.Main.Result res1 : res) {
        java.lang.System.out.println(("\t" + (res1.toString())));
    }
}
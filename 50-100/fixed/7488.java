public static void main(java.lang.String[] args) {
    try {
        com.celestia.csc155.RT.loadResourceScript("src/main/clojure/main.clj");
        com.celestia.csc155.RT.loadResourceScript("src/main/clojure/util.clj");
        com.celestia.csc155.RT.loadResourceScript("src/main/clojure/models.clj");
        require.invoke(clojure.java.api.Clojure.read("main-ns"));
        com.celestia.csc155.IFn function = clojure.java.api.Clojure.var("main-ns", "main");
        function.invoke();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}
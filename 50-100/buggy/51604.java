public static void greetings() {
    java.nio.file.Path head = java.nio.file.Paths.get("/home/salankiv/greenfox/salankiv-todo-app/assets/head.txt");
    try {
        java.lang.System.out.print("c");
        java.util.List<java.lang.String> lines = java.nio.file.Files.readAllLines(head);
        for (java.lang.String l : lines) {
            java.lang.System.out.println(l);
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}
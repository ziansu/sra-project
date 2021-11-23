public static void listing() {
    try {
        java.nio.file.Path taskFile = java.nio.file.Paths.get("/home/salankiv/greenfox/salankiv-todo-app/assets/tasks.txt");
        java.util.List<java.lang.String> lines = java.nio.file.Files.readAllLines(taskFile);
        for (int i = 0; i < (lines.size()); i++) {
            java.lang.System.out.println((((i + 1) + ". ") + (lines.get(i))));
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}
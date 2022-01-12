@org.junit.Test
public void testDecideOnDirectory() throws java.io.IOException {
    java.nio.file.Path path = java.nio.file.Paths.get("src", "test", "resources", "arith_funcs_solution_file");
    java.nio.file.Path temp = createTemporaryCopyOf(path);
    temp.toFile().deleteOnExit();
    java.nio.file.Path toPath = com.google.common.io.Files.createTempDir().toPath();
    fi.helsinki.cs.tmc.langs.domain.Filer filer = new fi.helsinki.cs.tmc.langs.domain.Filer().setToPath(toPath);
    org.junit.Assert.assertEquals(java.nio.file.FileVisitResult.CONTINUE, filer.decideOnDirectory(temp));
}
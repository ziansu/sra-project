public static void installAdventure() {
    java.lang.System.out.println("What is the file path? ");
    java.io.File file = new java.io.File(textrpg_console.TextRPG.scan.nextLine());
    try {
        net.lingala.zip4j.core.ZipFile zipfile = new net.lingala.zip4j.core.ZipFile(file);
        zipfile.extractAll(((textrpg_console.TextRPG.dirname) + "adventures/"));
    } catch (net.lingala.zip4j.exception.ZipException e) {
        e.printStackTrace();
        java.lang.System.out.println("Something went wrong");
    }
}
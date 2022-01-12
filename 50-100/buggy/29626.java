public static void main(java.lang.String[] args) {
    com.thegoodhen.launcher.FullNameGenerator fng = new com.thegoodhen.launcher.FullNameGenerator();
    java.lang.System.out.println(fng.generateString(new java.io.File("")));
    com.thegoodhen.launcher.FirstSentenceDescGenerator fsdg = new com.thegoodhen.launcher.FirstSentenceDescGenerator();
    java.lang.System.out.println(fsdg.generateString(new java.io.File("")));
    com.thegoodhen.launcher.FullDescGenerator fdg = new com.thegoodhen.launcher.FullDescGenerator();
}
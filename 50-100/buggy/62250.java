public static void findAllBlocksForAge(int new_age) {
    int index = new_age - 18;
    if (((com.adb.uas.Main.Main.buckets[index].length) > 0) && ((com.adb.uas.Main.Main.buckets[index][0]) != 0)) {
        com.adb.uas.Main.Main.recursiveMethod(com.adb.uas.Main.Main.buckets[index], new_age);
    }else {
        java.lang.System.out.println((("There are no records with age " + new_age) + " in the file."));
    }
}
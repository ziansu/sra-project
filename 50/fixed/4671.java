static void sort(java.lang.String[] arr) {
    java.util.Arrays.sort(arr, (java.lang.String s1,java.lang.String s2) -> careercup.chapter10.GroupAnagrams.sortChars(s1).compareTo(careercup.chapter10.GroupAnagrams.sortChars(s2)));
}
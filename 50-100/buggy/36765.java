private void dumpList(java.lang.String name, int[] list) {
    edu.miamioh.culturecode.Util.debug(name);
    for (int i = 0; i < (teamAssignment.length); i++) {
        edu.miamioh.culturecode.Util.debug("%2d ", list[i]);
    }
    edu.miamioh.culturecode.Util.debug("");
}
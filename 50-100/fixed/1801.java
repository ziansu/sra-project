public static java.util.List<com.lir.library.domain.Story> removeRepeatedItems(java.util.List<com.lir.library.domain.Story> list) {
    java.util.List<com.lir.library.domain.Story> newlist = new java.util.ArrayList<com.lir.library.domain.Story>();
    for (com.lir.library.domain.Story s : list) {
        if (!(controllers.Stories.isStoryContainedInList(s, newlist)))
            newlist.add(s);
        
    }
    return newlist;
}
public static void expandAll(src.GameTree gt, int depth) {
    java.lang.System.out.println(("hi" + depth));
    java.util.ArrayList<src.GameTree> branches = src.FindBestMove.expand(gt);
    if ((gt.getDepth()) == (depth - 1)) {
    }else {
        for (src.GameTree b : branches) {
            src.FindBestMove.expandAll(b, depth);
        }
    }
}
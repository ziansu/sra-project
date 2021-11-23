public void deleteLines(int start, int end) {
    int len = end - start;
    if (len <= 0)
        return ;
    
    java.util.List<java.lang.CharSequence> deleted = lines().subList(start, end);
    if (record) {
        history().addOne(new neoe.ne.U.HistoryCell(neoe.ne.U.BasicAction.DeleteLines, start, end, 0, 0, new java.util.ArrayList(deleted)));
    }
    deleted.clear();
}
private void buildLayout() {
    loadAll();
    java.util.Collections.sort(memos, new java.util.Comparator<com.example.ffrae_000.memo.Memo>() {
        @java.lang.Override
        public int compare(com.example.ffrae_000.memo.Memo memo, com.example.ffrae_000.memo.Memo t1) {
            return t1.compareTo(memo);
        }
    });
    for (com.example.ffrae_000.memo.Memo m : memos) {
        addButtons(m);
    }
}
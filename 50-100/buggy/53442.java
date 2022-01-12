public java.util.List<com.example.gmore.lapag.Transactions> orderedTransactions(java.util.List<com.example.gmore.lapag.Transactions> original_list) {
    java.util.List<com.example.gmore.lapag.Transactions> ordered_transactions = original_list;
    java.util.Collections.sort(ordered_transactions, new java.util.Comparator<com.example.gmore.lapag.Transactions>() {
        @java.lang.Override
        public int compare(com.example.gmore.lapag.Transactions tr1, com.example.gmore.lapag.Transactions tr2) {
            return (tr1.getDate_iterator()) < (tr2.getDate_iterator()) ? -1 : (tr1.getDate_iterator()) > (tr2.getDate_iterator()) ? 1 : 0;
        }
    });
    return ordered_transactions;
}
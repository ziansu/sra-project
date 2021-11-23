int indexSize(java.util.List<java.lang.String> index) {
    return (tran.indexSize(tbl.num(), listToCommas(index))) + (index.size());
}
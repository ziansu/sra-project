public void clear() {
    log.trace("hive_context::clear");
    con_ = null;
    sql_ = null;
    stm_ = null;
    rst_ = null;
    rmd_ = null;
}
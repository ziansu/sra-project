static void reloadWithEncodingByUser(java.lang.String fn, neoe.ne.PlainPage pp) {
    if (fn == null) {
        pp.ui.message("file not saved.");
        return ;
    }
    neoe.ne.U.setEncodingByUser(pp, "Reload with Encoding:");
    neoe.ne.U.readFile(pp.pageData, fn);
}
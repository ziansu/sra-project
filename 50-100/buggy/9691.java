private java.lang.String getHtml() throws java.io.IOException {
    java.lang.String[] keys = new java.lang.String[]{ "#RECEIPT" , "#JSONDATA" };
    java.lang.String[] values = new java.lang.String[]{ getReceiptType().toString() , getJsonString() };
    if ((values[0]) == "17") {
        return new co.celloscope.printingdemo.HtmlHelper(this).getHtml(co.celloscope.printingdemo.MainActivity.MINI_STATEMENT_TEMPLATE_HTML, keys, values);
    }else {
        return new co.celloscope.printingdemo.HtmlHelper(this).getHtml(co.celloscope.printingdemo.MainActivity.TEMPLATE_HTML, keys, values);
    }
}
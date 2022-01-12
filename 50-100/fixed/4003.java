@java.lang.Override
public boolean isoutofStock() {
    try {
        doc = getDoc();
    } catch (java.net.SocketTimeoutException e) {
        java.lang.System.out.println("Time out catch from website sub class");
    }
    java.lang.String text = doc.toString().toLowerCase();
    int count = StockChecker.websites.Homedepot.countSubstring("out of stock", text);
    org.jsoup.select.Elements oosMessage2 = doc.getElementsMatchingText(java.util.regex.Pattern.compile("Express Delivery"));
    return count > 3;
}
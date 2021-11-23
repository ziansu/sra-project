public void toHTMLTable(java.io.PrintWriter ostr) {
    T tmp;
    ostr.print("<table>");
    while (this.results.hasNext()) {
        tmp = this.results.next();
        ostr.print(tmp.toHTMLTableRow());
    } 
    ostr.print("</table>");
    ostr.flush();
}
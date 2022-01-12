public void toHTMLTable(java.io.PrintWriter output) {
    T tmp;
    output.print("<table>");
    while (this.results.hasNext()) {
        tmp = this.results.next();
        output.print(tmp.toHTMLTableRow());
    } 
    output.print("</table>");
    output.flush();
}
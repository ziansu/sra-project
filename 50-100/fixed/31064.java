@java.lang.Override
public java.lang.String toText() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    if ((entries) != null)
        for (gov.nist.validation.report.Entry e : entries)
            sb.append(e.toText()).append("\n");
        
    
    return sb.toString();
}
@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    switch (renderingType) {
        case html :
            toHtml(sb);
            break;
        case csv :
            {
                toCsv(sb);
                break;
            }
        default :
            org.gwtTests.base.Check.isTrue(false);
            break;
    }
    return sb.toString();
}
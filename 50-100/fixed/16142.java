public java.lang.String getCopyText(boolean isJustText) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (int i = 0; i < (list.size()); i++) {
        net.jejer.hipda.bean.ContentAbs o = list.get(i);
        if ((!isJustText) || (o instanceof net.jejer.hipda.bean.ContentText))
            sb.append(o.getCopyText());
        
    }
    return sb.toString();
}
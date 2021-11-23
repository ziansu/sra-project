@java.lang.Override
public void onTagStart(tk.sunrisefox.htmlparser.HTML.Tag tag, tk.sunrisefox.htmlparser.HTML.AttributeSet attributeSet) {
    com.kongx.nkuassistant.Connector.tmpStudiedCourseCount = 29;
    if ((tag.equals("td")) && (!(TDStart))) {
        TDStart = true;
        process = true;
    }else
        if ((!(tag.equals("td"))) && (TDStart)) {
            (com.kongx.nkuassistant.Connector.tmpStudiedCourseCount)++;
            android.util.Log.e("ERROR", ((com.kongx.nkuassistant.Connector.tmpStudiedCourseCount) + ""));
            process = false;
            (singleCourseTextCount)++;
        }
    
}